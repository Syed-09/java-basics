package com.training.Feb19th_Day1.AccountTask;
public class Account {
    private final int accountNumber;
    private double balance;

    private final int age;

    public Account(int accountNumber, double balance, int age) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.age = age;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Your current balance is:" +getBalance());
        } else {
            System.out.println("Invalid amount for deposit.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Your current balance is:" +getBalance());
        } else {
            System.out.println("Low Balance!!");
        }
    }

    public double getBalance() {
        return balance;
    }
    public int getAge() {
        return age;
    }
}