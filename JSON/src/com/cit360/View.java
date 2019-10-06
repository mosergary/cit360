package com.cit360;

import java.io.FileNotFoundException;

public class View {
    public static void parkView() throws FileNotFoundException {
        //put a user selection here
        System.out.println("Here is a list of national parks pulled from a Json file created in the Model");
        Controller.parse();
    }
}
