package com.training.Feb22nd_Day4.Executor;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PingUrlTester {
    private static final int numThreads =30; //pingurl
    public static void main(String... args) throws ExecutionException, InterruptedException {

        ExecutorService executor = Executors.newFixedThreadPool(numThreads); //ping url

        String[] domains = {
                "https://google.com",
                "https://bing.com",
                "https://yahoo.com",
                "https://paypal.com",
                "https://wordpress.in",
                "https://www.ebay.com",
                "https://www.wikipedia.com"
        };

        for (int i =0; i<domains.length; i++){
            String url = domains[i];
            PingUrl worker = new PingUrl(url);
            executor.execute(worker);

        }
        executor.shutdown();

//        if(executor.isTerminated()){
//            System.out.println("Finished Execution!!");
//        }
    }
}

