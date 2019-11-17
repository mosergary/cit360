package com.cit360;

import org.junit.*;

import static org.junit.Assert.*;

public class accountTest {


    @BeforeClass
    public static void beforetest(){
        System.out.println("Testing is about to begin");
    }

    @Before
    public void testing(){
        System.out.println("Testing");
    }
    @Test

    //assert fail used to test code by make a portion fail " message can be added for information"
    public void testFail() {
        account myaccount = new account(1000.0D, "Gary", account.Checking);
        double balance = myaccount.deposit(200.0D);
        Assert.fail("this intentionally failed to test getbalance()");


    }

    @Test
    public void deposit() {
        account myaccount = new account(1000.0D, "Gary", account.Checking);
        double balance = myaccount.deposit(200.0D);
        Assert.assertEquals(1200.0D, balance, 0.0D);
    }




    @Test
    public void withdraw() {
        account myaccount = new account(1000.0D, "Gary", account.Checking);
        double balance = myaccount.withdraw(200.0D);
        Assert.assertEquals(800.0D, balance, 0.0D);
    }

    @Test
    public void getBalance_deposit() {
        account myaccount = new account(1000.0D, "Gary", account.Checking);
        myaccount.deposit(200.0D);
        Assert.assertEquals(1200.0D, myaccount.getBalance(), 0.0D);
    }

    @Test
    public void getBalance_withdraw() {
        account myaccount = new account(1000.0D, "Gary", account.Checking);
        myaccount.withdraw(200.0D);
        Assert.assertEquals(800.0D, myaccount.getBalance(), 0.0D);

    }

// passes because this is a checking and it is true
    @Test
    public void isCheckingTrue() {
        account myaccount = new account(1000.0D, "Gary", account.Checking);
        assertTrue(account.isChecking());

    }
// fails beacause this in a savings not a cheking
    @Test
    public void isCheckingFalse() {
        account myaccount = new account(1000.0D, "Gary", account.Saving);
        assertTrue("This is not a checking account", account.isChecking());
    }

     @Test
     public void assertfalse() {
        account myaccount = new account(1000.0D, "Gary", account.Saving);
        assertFalse("This is not a checking account", account.isChecking());
    }

    //boolean passes because this is true
    @Test
    public void isSavingTrue() {
        account myaccount = new account(1000.0D, "Gary", account.Saving);
        assertTrue("This is not a checking account", account.isSaving());

    }
//bollean test fails because this is not true
    @Test
    public void isSavingsFalse() {
        account myaccount = new account(1000.0D, "Gary", account.Checking);
        assertTrue("This is not a savings account", account.isSaving());
    }

    @Test
    public void dummyTest1() {
        Assert.assertEquals(20L, 21L);
    }

//passes because account is not nulll
    @Test
    public void notNull() {
        account myaccount = new account(1000.0D, "Gary", account.Checking);
    assertNotNull(myaccount);
    }
// fails because my account is not null
    @Test
    public void Null() {
        account myaccount = new account(1000.0D, "Gary", account.Checking);
        assertNull(myaccount);
    }

    @AfterClass
    public static  void after(){
        System.out.println("Testing is Complete");
    }





}