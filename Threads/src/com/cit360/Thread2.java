package com.cit360;

public class Thread2 extends Thread{
    @Override
    public void run() {

        System.out.println("Second Thread " + currentThread().getName());
        try {
            Thread.sleep(3000);
        }catch (InterruptedException e) {
            System.out.println("Another thread interrupted me");
            return;
        }
        System.out.println("3 seconds passed Thread 2 is awake");
    }
}
