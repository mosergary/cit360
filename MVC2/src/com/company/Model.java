package com.company;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;


public class Model {


//model contains the Data and where the data is retrieved
static String collections(String zip){


    Map<Integer,String> zip2 = new HashMap<Integer, String>();
    zip2.put(83706,"boise");
    zip2.put(83686, "Meridian");
    zip2.put(83607,"caldwell");
    zip2.put(83704,"boise");

    int result = Integer.parseInt(zip);
    return zip2.get(result);



}
// store data using model
    public static void map() throws FileNotFoundException {
        //First Park
        JSONObject yellowStone = new JSONObject();
        yellowStone.put("Park","YellowStone");
        yellowStone.put("reservation","Reservations needed for camping spaces");
        yellowStone.put("services","power, showers, outhouse available");
        yellowStone.put("Location", "Wyoming");
        yellowStone.put("sites","Old Faithful");

        JSONObject nationalParks = new JSONObject();
        nationalParks.put("park", yellowStone);


        //Second Park
        JSONObject yosemite = new JSONObject();
        yosemite.put("Park","Yosemite");
        yosemite.put("reservation","NO Reservations needed for camping spaces");
        yosemite.put("services","NO power, NO showers, outhouse available");
        yosemite.put("Location", "Califonia");
        yosemite.put("sites","Wawona Grove");

        JSONObject nationalParks2 = new JSONObject();
        nationalParks2.put("park", yosemite);

        JSONArray parkList = new JSONArray();
        parkList.add(nationalParks);
        parkList.add(nationalParks2);

        PrintWriter toFile = new PrintWriter("map.json");
        toFile.write(parkList.toJSONString());

        toFile.flush();
        toFile.close();






    }

    public static JSONArray parse() {

        JSONParser parksParsed = new JSONParser();

        try (FileReader reader = new FileReader("map.json")) {
            Object myPark = parksParsed.parse(reader);

            JSONArray parkList = (JSONArray) myPark;

//https://howtodoinjava.com/library/json-simple-read-write-json-examples/
            parkList.forEach(park -> parseParkObject((JSONObject) park));


            return parkList;

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (org.json.simple.parser.ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void parseParkObject(JSONObject park){
        JSONObject parkObject = (JSONObject)park.get("park");

        String parkName = (String) parkObject.get("Park");
        //System.out.println(parkName);


    }




}



