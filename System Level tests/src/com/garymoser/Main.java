package com.garymoser;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Double first = null;
        Double second = null;
        double result;

        Scanner reader = new Scanner(System.in);

        System.out.print("First number: ");
        try {
            first = reader.nextDouble();
        } catch (NumberFormatException e) {
            System.err.println("enter a number");
        }

        System.out.print("Second number: ");
        try {
            second = reader.nextDouble();
        } catch (NumberFormatException e) {
            System.err.println("eee");
        }

        System.out.print("Do you want to add(+), subtract(-), Multiply(*) or Divide(/)");
        char operator = reader.next().charAt(0);

        switch(operator)
        {
            case '+':
                result = first + second;
                break;
            case '-':
                result = first - second;
                break;
            case '*':
                result = first * second;
                break;
            case '/':
                result = first / second;
                break;
            default:
                System.out.print("Sorry you didn't enter a +, -, *, /");
                return;
        }
        System.out.print(result);
    }

    }

