package com.training.Feb20th_Day2.Multithreading;

public class MyThreadTester {
    public static void main(String args[]) throws InterruptedException {
        //Task-1
        MyThread t1 = new MyThread("Table 5", 5);
        MyThread t2 = new MyThread("Table 7", 7);
        t1.start();
        t1.join();
        t2.start();

        ////task2
//        SyncTable table1 = new SyncTable("Table 5",5);
//        SyncTable table2 = new SyncTable("Table 7",7);
//        table1.displayTable();
//        table2.displayTable();
    }
}
