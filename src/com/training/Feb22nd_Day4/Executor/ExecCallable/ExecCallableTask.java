package com.training.Feb22nd_Day4.Executor.ExecCallable;

import java.util.Scanner;

public class ExecCallableTask {

    private int number;

    public ExecCallableTask(int number) {
        this.number = number;
    }

    public int getNaturalNumSum(){

        int sum = 0;
        for (int i=0; i<number+1;i++){
            sum+=i;
        }
        System.out.println("Sum of all natural numbers till "+number+" is");
        return sum;
    }
}
