package com.cit360;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

// used examples on the https://www.geeksforgeeks.org/parse-json-java/ site for creating Json data

public class Model {
    public static void map() throws FileNotFoundException{
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



}
