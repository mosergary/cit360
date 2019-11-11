package com.cit360;

public class Thread3 extends Thread {
    @Override
    public void run() {

        System.out.println("Third Thread " + currentThread().getName());
        try {
            Thread.sleep(3000);
        }catch (InterruptedException e) {
            System.out.println("Another thread interrupted third thread");
            return;
        }
        System.out.println("3 seconds passed");
    }
}

