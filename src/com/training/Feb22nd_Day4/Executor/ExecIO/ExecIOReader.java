package com.training.Feb22nd_Day4.Executor.ExecIO;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ExecIOReader {

    private final String filePath;

    public ExecIOReader(String filePath) {
        this.filePath = filePath;
    }

    public StringBuilder readThisFile() throws IOException {
        InputStream input = new FileInputStream(filePath);
        System.out.println(Thread.currentThread().getName());
        int i = input.read();
        StringBuilder s= new StringBuilder();
        while(i !=-1){
            //System.out.print((char)i);
            s.append(String.valueOf((char) i));
            i = input.read();
        }
        input.close();
        return s;
    }

}
