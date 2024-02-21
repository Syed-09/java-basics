package com.training.Feb20th_Day2.ExpHandling.MarathonTask;

import java.util.Scanner;

public class MarathonRegistration {

    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Details");
        System.out.println("Name:");
        String name = sc.nextLine();


        int age = 0;
        boolean bool = true;

        while (bool){
            try{
                System.out.println("Age:");
                age = Integer.parseInt(sc.nextLine());
                if (age <= 0){
                    throw new IllegalArgumentException();
                }
                else {
                    bool = false;
                }
            }
            catch (IllegalArgumentException e){
                System.out.println("Age must be a number (Non-Zero and Non-Negative)");
            }
        }

        //bool = true;

        System.out.println("Gender (M/F/Other) :");
        String gender = sc.nextLine();


        //use regex to validate contact number
        System.out.println("ContactNumber:");
        double contactNum = Integer.parseInt(sc.nextLine());

        sc.close();

        System.out.println("Registration Done!!, Here are your details:");

        Marathon mar1 = new Marathon(name, age, gender, contactNum);
        mar1.getDetails();
    }
}
