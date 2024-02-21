package com.training.Feb19th_Day1.AccountTask;

public class AccountTester {
    public static void main(String[] args) {
        //Task1 --> Deposit and Withdraw
//        // Create an account with initial balance of $1000
//        Account account = new Account(9876, 1000);
//
//        // Deposit $200
//        account.deposit(200);
//
//        // Withdraw $500
//        account.withdraw(500);
//
//        // Display the balance
//        System.out.println("Current balance:" + account.getBalance());

        //Task2
        Account[] arr = new Account[5];
        arr[0] = new Account(9876, 1000, 24);
        arr[1] = new Account(9875, 1000, 22);
        arr[2] = new Account(9874, 1000, 20);
        arr[3] = new Account(9873, 1000, 22);
        arr[4] = new Account(9872, 1000, 22);
        System.out.println(getAverage(arr));
    }
    public static int getAverage(Account[] arr1){
        int ageSum = 0;
        for (Account acc: arr1){
            ageSum+=acc.getAge();
        }
        return ageSum/ arr1.length;
    }
}
