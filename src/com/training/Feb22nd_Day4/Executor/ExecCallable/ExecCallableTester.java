package com.training.Feb22nd_Day4.Executor.ExecCallable;

import java.util.Scanner;
import java.util.concurrent.*;

//user will give a number, and you should be able to add all natural numbers till
//the given number then run this using Single thread executor and display the result
public class ExecCallableTester {
    public static void main(String... args) throws ExecutionException, InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();

        ExecCallableTask task1 = new ExecCallableTask(num);
        Callable callableTask = () -> {
            return task1.getNaturalNumSum();
        };

        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future result = executor.submit(callableTask);
        System.out.println(result.get());
        executor.shutdown();
    }

}
