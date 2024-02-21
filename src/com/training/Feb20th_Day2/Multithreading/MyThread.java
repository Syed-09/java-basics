package com.training.Feb20th_Day2.Multithreading;

public class MyThread extends Thread {
    private String name;
    private int num;

    public MyThread(String name,int num) {
        this.num = num;
        this.name = name;
    }

    public void run(){
        System.out.println(name+" Started");
        for(int i=1; i<=10; i++){
            System.out.println(num*i);
        }
    }
}
