package com.training.Feb22nd_Day4.JavaNIO.AsynCompletion;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class AsynchronousFileDemo {

    public static void main(String... args) throws ExecutionException, InterruptedException, IOException {
        String filePath = "C:\\java-basics\\src\\com\\training\\Feb22nd_Day4\\JavaNIO\\AsynCompletion\\AsynInput.txt";
        Path path = Paths.get(filePath);

        AsynchronousFileChannel channel = AsynchronousFileChannel.open(path, StandardOpenOption.READ);

        ByteBuffer buffer = ByteBuffer.allocate(256);

        Future<Integer> result = channel.read(buffer,0);

        System.out.println("No of bytes read from the file: "+ result.get());

        buffer.flip();

        System.out.println("File Content: ");

        while(buffer.hasRemaining()){
            System.out.println((char) buffer.get());
        }
    }
}
