package com.cit360;
// Idea for the calculator from https://www.javaguides.net/2018/08/application-controller-design-pattern-in-java.html
import java.util.HashMap;

public class Controller {

    public static HashMap<String, Operation> hashMapOfOperation = new HashMap<String, Operation>();
    public  Controller() {
    }


    //using a hashmap instead of case statements, Idea from "Doing more with java"  makes for cleaner code
    public  Integer hashMaps(String operation, Integer firstNumber, Integer secondNumber) {
        //using the operator as the key to select the proper class
        hashMapOfOperation.put("+",  new Add());
        hashMapOfOperation.put("-", new Subtract());
        Operation math = hashMapOfOperation.get(operation);
        return(math.numbers(firstNumber, secondNumber));
    }
}
