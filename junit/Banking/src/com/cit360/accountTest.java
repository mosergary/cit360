package com.cit360;

import static org.junit.Assert.*;

public class accountTest {

    @org.junit.Test
    public void deposit() {
           account myaccount = new account(1000.00);
           double balance = myaccount.deposit(200.00);
           assertEquals(1200.00,balance, 0);
    }

    @org.junit.Test
    public void withdraw() {
        account myaccount = new account(1000.00);
        double balance = myaccount.withdraw(200.00);
        assertEquals(800.00,balance, 0);

    }

    @org.junit.Test
    public void getBalance_deposit() {
        account myaccount = new account(1000.00);
        myaccount.deposit(200.00);
        assertEquals(1200.00, myaccount.getBalance(), 0);
    }

    @org.junit.Test
    public void getBalance_withdraw() {
        account myaccount = new account(1000.00);
        myaccount.withdraw(200.00);
        assertEquals(800.00, myaccount.getBalance(), 0);
    }


    //empty tests will pass
    @org.junit.Test
    public void dummyTest(){

    }

    //hard coded comparison to show failed code
    @org.junit.Test
    public void dummyTest1(){
        assertEquals(20, 21);

    }
}