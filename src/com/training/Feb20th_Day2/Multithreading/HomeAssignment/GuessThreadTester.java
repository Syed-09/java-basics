package com.training.Feb20th_Day2.Multithreading.HomeAssignment;

import java.util.Scanner;

public class GuessThreadTester {

    public static int target;
    public static int count = 1;

    public static void main(String[] args) throws InterruptedException{

        GuessThread t1 = new GuessThread();
        t1.start();
        t1.join();

        Scanner sc = new Scanner(System.in);
        while (true){
            try{
                System.out.println("Enter a Number (1-9):");
                target = Integer.parseInt(sc.nextLine());
                break;
            }
            catch (IllegalArgumentException e){
                System.out.println("\nEnter a numerical value between 1 and 9");
            }
        }

        while (target != t1.getGuessNum()){
            while (true){
                try{
                    System.out.println("\nWrong Guess, Try again!! \nEnter a Number (1-9):");
                    target = Integer.parseInt(sc.nextLine());
                    break;
                }
                catch (IllegalArgumentException e){
                    System.out.println("\nEnter a numerical value between 1 and 9");
                }
            }
            count++;
        }
        System.out.println("\nYou have made it!, Target was:" + target);
        System.out.println("Attempts made:"+count);
    }
}
