package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.Scanner;

public class View {
    public static Integer userView(){

//view is displayed to the end user for input
        Scanner userInput = new Scanner(System.in);
        System.out.print("\nPlease enter you name\n");
        String userSelection = userInput.nextLine();
        System.out.print("\nWelcome "+ userSelection);
        System.out.print("\n"+userSelection + ", " + "please enter your selection from one of the Choices below");
        System.out.print("\n1: HTTPURL example");
        System.out.print("\n2: JSon example");
        System.out.print("\n3: Collection example \n");
        Scanner userInput2 = new Scanner(System.in);
        Integer userSelection2 = userInput2.nextInt();
        return userSelection2;

    }

    //View also contain the communication to other computer systems
    public static String displayJSON (){
        String webSite = "http://www.byui.online/json/nationalPark.json";
        StringBuilder jsonString = new StringBuilder();
        URLConnection connection = null;
        InputStreamReader jsonFromSite = null;
        try {
            URL url = new URL(webSite);
            connection = url.openConnection();
            if (connection != null)
                connection.setReadTimeout(60 * 1000);
            if (connection != null && connection.getInputStream() != null) {
                jsonFromSite = new InputStreamReader(connection.getInputStream(),
                        Charset.defaultCharset());
                BufferedReader bufferedReader = new BufferedReader(jsonFromSite);
                if (bufferedReader != null) {
                    int c;
                    while ((c = bufferedReader.read()) != -1) {
                        jsonString.append((char) c);
                    }
                    bufferedReader.close();
                }
            }
            jsonFromSite.close();
        } catch (Exception e) {
            throw new RuntimeException("Cannot connect to" + webSite, e);
        }

        return jsonString.toString();
    }
//view is for communication with other systems
public static String collecionInput(){
    Scanner userInput = new Scanner(System.in);
    System.out.print("This is an example of a collection");
    System.out.print("\n Please enter one of the following zipcodes\n 83607\n83686");
    String userSelection = userInput.nextLine();
    return userSelection;



}

    public static void http(){
        try {
            URL url = new URL("http://www.byui.online/json/nationalPark.json");
            System.out.println("URL is " + url.toString());
            System.out.println("protocol is " + url.getProtocol());
            System.out.println("authority is " + url.getAuthority());
            System.out.println("file name is " + url.getFile());
            System.out.println("host is " + url.getHost());
            System.out.println("path is " + url.getPath());
            System.out.println("port is " + url.getPort());
            System.out.println("default port is " + url.getDefaultPort());
            System.out.println("query is " + url.getQuery());
            System.out.println("ref is " + url.getRef());
        } catch (IOException e) {
            e.printStackTrace();


        }}

}
