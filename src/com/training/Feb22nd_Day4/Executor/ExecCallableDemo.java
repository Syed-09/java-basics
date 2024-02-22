package com.training.Feb22nd_Day4.Executor;

import java.util.concurrent.*;

public class ExecCallableDemo {

    public static void main(String... args) throws ExecutionException, InterruptedException {


//        Runnable runnableTask = () -> {
//
//            System.out.println("Performing Runnable Task");
//        };
//
//
//        ExecutorService executor = Executors.newSingleThreadExecutor();
//        Future status = executor.submit(runnableTask);
//        System.out.println(status.get());
//        executor.shutdown();

        Callable callableTask = () -> {

            System.out.println("Performing Callable Task");
            return "Callable Task Done!!";
        };


        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future status = executor.submit(callableTask);
        System.out.println(status.get());
        executor.shutdown();

    }

}

