package com.cit360;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Controller {


    public static void parse() throws FileNotFoundException {

        JSONParser parksParsed = new JSONParser();

        try (FileReader reader = new FileReader("map.json")) {
            Object myPark = parksParsed.parse(reader);

            JSONArray parkList = (JSONArray) myPark;

//https://howtodoinjava.com/library/json-simple-read-write-json-examples/
            parkList.forEach(park -> parseParkObject((JSONObject) park));

            System.out.println("Here is the json data being used ");
            System.out.println(parkList);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public static void parseParkObject(JSONObject park){
        JSONObject parkObject = (JSONObject)park.get("park");

        String parkName = (String) parkObject.get("Park");
        System.out.println(parkName);


    }

   }
