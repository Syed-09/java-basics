package com.training.Feb20th_Day2.EvenOdd;

import java.util.function.Predicate;

public class EvenOdd {
    public static void main(String... args){
        //Predicate functional interface usage
        //We can use our own functional interface too
        Predicate<Integer> obj = a -> a%2!=0;
        System.out.println(obj.test(2));
    }
}

