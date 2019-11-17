package com.cit360;

public class account {
    private static int accountType;
    private double balance;
    private String firstname;

public static final int Checking= 1;
public static final int Saving = 2;


    //constructor


    public account(double balance, String firstname, int accountType ){
        this.balance = balance;
        this.firstname = firstname;
        this.accountType = accountType;

    }



    public double deposit(double amount){
        balance += amount;
        return balance;
    }



    public double withdraw(double amount){
        balance -= amount;
        return balance;
    }


    public double getBalance() {
        return balance;
    }

    public static boolean isChecking() {
        return accountType == Checking;

}

    public static boolean isSaving() {
        return accountType == Saving;

    }

    }


