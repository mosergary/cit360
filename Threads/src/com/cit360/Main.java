package com.cit360;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class Main {

    public static void main(String[] args) {

 ///////////////        Threads        /////////////////////////////////////////////


        //order it outputs is not in the same order every time
        //main thread
        System.out.println("Main Thread");

        //thread 2
	    Thread thread2 = new Thread2();
	    //you can name the thread
	    thread2.setName("thread 2");
	    thread2.start();


        //anonymous class thread
        new Thread() {
            public void run() {
                System.out.println("anonymous class thread");
            }}.start();



  /////////////////    Runnable ////////////////////////////////

        Thread myRunnableThread = new Thread(new MyRunnable()){
        @Override
                public void run(){
            System.out.println("anonymous runnable");
        }};
        myRunnableThread.start();

        Thread thread3 = new Thread3();
        thread3.start();

        //interrupt thread3
        thread3.interrupt();

        //main thread again
	    System.out.println("Main Thread Again");

	    //this will error, threads cannot be run again
        // thread2.start();


/////  Executor with 5 pools  ////////////////////////////////////////
        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(2);
        for (int i = 1; i <= 5; i++)
        {
            Task task = new Task("Task " + i);
            System.out.println("Created : " + task.getName());

            executor.execute(task);
        }
        executor.shutdown();


        }
}