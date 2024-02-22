package com.training.Feb22nd_Day4.Executor.ExecIO;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//Using executor service read data from multiple files and display it along with the thread name
//make sure different threads read different files
public class ExecIOTask {

    public static final int numThreads =30;
    public static void main(String... args) throws IOException {


        String[] filePaths = {
                "C:\\java-basics\\src\\com\\training\\Feb22nd_Day4\\Executor\\ExecIO\\input1.txt",
                "C:\\java-basics\\src\\com\\training\\Feb22nd_Day4\\Executor\\ExecIO\\input2.txt",
                "C:\\java-basics\\src\\com\\training\\Feb22nd_Day4\\Executor\\ExecIO\\input3.txt"
        };

        Runnable runnableTask = () -> {
            try {
                for(String path: filePaths){
                    ExecIOReader reader = new ExecIOReader(path);
                    System.out.println(reader.readThisFile());

                    InputStream input = new FileInputStream(path);
                    System.out.println(Thread.currentThread().getName());
                    int i = input.read();
                    StringBuilder s= new StringBuilder();
                    while(i !=-1){
                        //System.out.print((char)i);
                        s.append(String.valueOf((char) i));
                        i = input.read();
                    }
                    System.out.print(s);
                    input.close();
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        };

        ExecutorService executor = Executors.newFixedThreadPool(numThreads);
        executor.execute(runnableTask);
        executor.execute(runnableTask);
        executor.shutdown();

    }
}
