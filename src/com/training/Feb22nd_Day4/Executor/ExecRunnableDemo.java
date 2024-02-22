package com.training.Feb22nd_Day4.Executor;

import java.time.LocalDateTime;
import java.util.concurrent.*;

public class ExecRunnableDemo {
    public static void main(String... args) throws ExecutionException, InterruptedException {


        Runnable runnableTask = () -> {

            try {
                // you will get an output in the console only after 5secs
                TimeUnit.MILLISECONDS.sleep(5000);
                System.out.println("Current time ::" + LocalDateTime.now());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };

        ExecutorService executor = Executors.newSingleThreadExecutor();
        executor.execute(runnableTask);

        executor.shutdown();

        if(executor.isTerminated()){
            System.out.println("Finished Execution!!");
        }

    }
}
