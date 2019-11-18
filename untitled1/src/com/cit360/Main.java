package com.cit360;
import java.util.Random;
import java.util.concurrent.ThreadPoolExecutor;

//simple bank account program with two threads.  Could be used id two people are depositing and withdrawing
//at the same time
public class Main {

    public static void main(String[] args) {
        // write your code here
        final Account account = new Account("12134", 1000);
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                account.deposit(90.00);
                account.withdraw(1000.00);
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                account.deposit(1.00);
                account.withdraw(68.00);
            }

        }
        );

        thread1.start();
        thread2.start();

        System.out.println(account.getAccountNumber());
        System.out.println(account.getBalance());
        System.out.println(account.getBalance());

        //to execute the writer and reader
        Message message = new Message();
        (new Thread(new Writer(message))).start();
        (new Thread(new Reader(message))).start();
    }


    /////messages with Threading


}

class Message {
    private String message;
    private boolean empty = true;

    public synchronized String read() {
        while (empty) {
            try {
                //wait prevents deadlocks
                wait();
            } catch (InterruptedException e) {
            }
        }
            empty = true;
        //tells the threads performing a similar task about a lock- only one thread in woke up
        notifyAll();
            return message;
        }
        public synchronized void write (String message){
            while (!empty) {
                try {
                    wait();
                } catch (InterruptedException e) {
                }
                }
                empty = false;
                this.message = message;
                notifyAll();
            }
        }


    class Writer implements Runnable {
        private Message message;

        public Writer(Message message) {
            this.message = message;
        }

        public void run() {
            String messages[] = {
                    "When using threads",
                    "You can make them sleep",
                    "You can lock the threads",
                    "Start them randomly",
                    "The accounts above are synchronized ",
                    "to allow them to occur concurrently"

            };
//  This code below I used a Udemy course on java--Java masterclass
            Random random = new Random();
            for (int i = 0; i < messages.length; i++) {
                message.write(messages[i]);
                try {
                    Thread.sleep(random.nextInt(2000));
                } catch (InterruptedException e) {
                }
            }
            message.write("Finished");
        }

    }

    class Reader implements Runnable {
        private Message message;

        public Reader(Message message) {
            this.message = message;

        }

        public void run() {
            Random random = new Random();
            for (String latestMessage = message.read(); !latestMessage.equals("Finished");
                 latestMessage = message.read()) {
                System.out.println(latestMessage);
                try {
                    Thread.sleep(random.nextInt(2000));
                } catch (InterruptedException e) {
                }
            }
        }
    }