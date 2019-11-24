package com.cit360;
// Idea for the calculator from https://www.javaguides.net/2018/08/application-controller-design-pattern-in-java.html
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Controller Control = new Controller();

        Integer firstNumber ;
        Integer secondNumber;
        String operator;

        Scanner in = new Scanner(System.in);
        System.out.println("First Number");
        try{
            firstNumber = Integer.parseInt(in.nextLine());
        }catch(NumberFormatException e){
            //if other data type is entered set to 0
            firstNumber = 0;
        }
        System.out.println("Select Subtract (-), or Add (+)");
        operator = in.nextLine();
        System.out.println("Second Number ");
        try{
            secondNumber = Integer.parseInt(in.nextLine());
        }catch(NumberFormatException e){
            //if other data type is entered set to 0
            secondNumber = 0;
        }
            System.out.println( firstNumber + " " + operator + " " + secondNumber + " = ");
            System.out.println(Control.hashMaps(operator, firstNumber, secondNumber));

    }
}
