package com.training.Feb20th_Day2.AddSum;

public class LambdaDemo{
    public static void main(String... args){
        FuncInterface obj = (a, b) -> a+b;
        System.out.println(obj.getsum(20,25));
    }
}
