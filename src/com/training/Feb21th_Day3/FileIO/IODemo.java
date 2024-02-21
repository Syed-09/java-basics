package com.training.Feb21th_Day3.FileIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

//do an output demo too
public class IODemo {
    public static void main(String... args) throws IOException {

        //byte[] array = new byte[100];
        InputStream input = new FileInputStream("C:\\java-basics\\src\\com\\training\\Feb21th_Day3\\FileIO\\input.txt");
        //input.read(array);

        int i = input.read();
        while(i !=-1){
            System.out.print((char)i);
            i = input.read();
        }

        //String data = new String(array);
        //System.out.println(data);
        input.close();
    }
}
