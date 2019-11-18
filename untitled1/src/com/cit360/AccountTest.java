package com.cit360;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class AccountTest {

    @Test
    public void deposit() {
        Account account = new Account("12345", 1000.00);
        account.deposit(200.00);
        Assert.assertEquals(1200.00,account.getBalance(),0.0);

    }

    @Test
    public void withdraw() {
        Account account = new Account("12345", 1000.00);
        account.withdraw(200.00);
        Assert.assertEquals(800.00,account.getBalance(),0.0);
    }

    @Test
    public void  getAccountNumber() {
        Account account = new Account("12345", 1000.00);
        account.getAccountNumber();
        Assert.assertSame("12345", account.getAccountNumber());


    }

    @Test
    public void getBalance() {
        Account account = new Account("12345", 1000.00);
        account.getAccountNumber();
        Assert.assertNotNull(account.getAccountNumber());
    }
}