package com.training.Feb20th_Day2.EvenOdd;

public class EvenOdd {
    public static void main(String... args){
        FuncInterface2 obj = a -> a%2!=0 ? "Odd" : "Even";
        System.out.println(obj.EvenOdd(20));
    }
}
