package com.cit360;
import java.io.IOException;
import java.net.URL;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URLConnection;
import java.nio.charset.Charset;

public class Main {

    public static void main(String[] args) {
        //sets site to get data, My personal site for assignments
        //test json from previous class Json app
        String webSite = "http://www.byui.online/json/nationalPark.json";

        //Display data returned from the displayJson Method
        System.out.println(displayJSON(webSite));

//https://www.tutorialspoint.com/java/java_url_processing.htm
//Simple connection and way to display site information
        try {
            URL url = new URL(webSite);
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
// goes to the site and open the file, builds a string and returns it to be displayed.  This Json could be used for Parsing and
    //combined with other assignments used examples and ideas from
    //https://stackoverflow.com/questions/10500775/parse-json-from-httpurlconnection-object
    //https://alvinalexander.com/blog/post/java/how-open-url-read-contents-httpurl-connection-java
        public static String displayJSON (String webSite){
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
    }







