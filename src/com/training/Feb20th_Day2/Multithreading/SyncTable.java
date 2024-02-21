//task2
//package com.training.Feb20th.Multithreading;
//
//public class SyncTable {
//    private String name;
//    private int num;
//
//
//    public SyncTable(String name, int num) {
//        this.name = name;
//        this.num = num;
//    }
//
//    public void displayTable(){
//        MyThread t1=new MyThread(name,num);
//        System.out.println(name+" Started");
//        t1.start();
//        for(int i=1; i<=10; i++){
//            System.out.println(num*i);
//        }
//    }
//}
