package com.cit360;

public class account {
    private double balance;
//constructor
    public account(double balance) {
        this.balance = balance;
    }
    public double deposit(double amount){
        balance += amount;
        return balance;
    }

    public double withdraw(double amount){
        balance -= amount;
        return balance;
    }
    public double getBalance(){
        return balance;
    }
}
