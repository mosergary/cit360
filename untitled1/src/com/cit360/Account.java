package com.cit360;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Account {
    private double balance;
    private String accountNumber;
    private Lock lock;

    public Account(String accountNumber, double intBalance) {
        this.balance = intBalance;
        this.accountNumber = accountNumber;
        this.lock = new ReentrantLock();
    }

    public synchronized void deposit(double amount) {
        lock.lock();
        try {
            balance += amount;
        } finally {
            lock.unlock();
        }
    }
    public synchronized void withdraw(double amount){
            lock.lock();
            try {
                balance -= amount;
            } finally {
                lock.unlock();
            }
        }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

}
