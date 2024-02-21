package com.training.Feb20th_Day2.Multithreading.HomeAssignment;

import java.util.Random;

public class GuessThread extends Thread {
    private int value;

    public void run(){
        System.out.println("Guessing Game Starts");
        Random random = new Random();
        int min = 1;
        int max =10;
        value = random.nextInt(min + max) + min;
    }

    public int getGuessNum (){
        return value;
    }
}
