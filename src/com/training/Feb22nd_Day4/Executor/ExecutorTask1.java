package com.training.Feb22nd_Day4.Executor;

import java.time.LocalDateTime;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

import static java.lang.System.out;

public class ExecutorTask1 {
    public static void main(String... args){
        Runnable runnableTask = () -> {
            IntStream.range(0,5).forEach(out::println);
            IntStream.range(6,10).forEach(out::println);
            IntStream.range(11,15).forEach(out::println);
//                // you will get an output in the console only after 5secs
//                TimeUnit.MILLISECONDS.sleep(5000);
//                System.out.println("Current time ::"+ LocalDateTime.now());

        };

        //You will get random execution of runnable task
        ExecutorService executor = Executors.newFixedThreadPool(3);
        executor.execute(runnableTask);
        executor.execute(runnableTask);
        //executor.execute(runnableTask);

        executor.shutdown();
    }
}
