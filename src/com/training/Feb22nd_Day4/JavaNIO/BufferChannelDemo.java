package com.training.Feb22nd_Day4.JavaNIO;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class BufferChannelDemo {
    public static void main(String... args) throws IOException {
        String fileName = "C:\\java-basics\\src\\com\\training\\Feb22nd_Day4\\JavaNIO\\textfile.txt";
        Path filePath = Paths.get(fileName) ;

        writeFile(filePath);
        readFile(filePath);

//        //Instead of going for File and files path, you can directly go for a channel directly.
//        FileInputStream in = new FileInputStream("bufferFileInputStream.txt");
//        ReadableByteChannel channel = in.getChannel();
    }

    private static void writeFile(Path filePath) {
        String input = "This text will be written from java code (JavaNIO Folder)";
        System.out.println("Writing Text: "+filePath.getFileName()+" ::"+input);
        byte[] inputBytes = input.getBytes();

        ByteBuffer writer = ByteBuffer.wrap(inputBytes);
        FileChannel writeChannel = null;

        try {
            writeChannel = FileChannel.open(filePath, StandardOpenOption.CREATE, StandardOpenOption.WRITE);
            //communication should always happen with the buffer but not directly
            int numOfBytesWritten = writeChannel.write(writer);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        finally {
            try{
                writeChannel.close();
            }
            catch (IOException e){
                throw new RuntimeException(e);
            }
        }
    }

    private static void readFile(Path filePath) throws IOException {

        FileChannel readChannel = FileChannel.open(filePath);
        //ByteBuffer readBuffer = ByteBuffer.allocate(24);
        //Instead of reading it with unknown size; do this
        ByteBuffer readBuffer = ByteBuffer.allocate(Math.toIntExact(readChannel.size()));
        try {
            readChannel.read(readBuffer);
            byte[] bytes = readBuffer.array();
            String output = new String(bytes);
            System.out.println("Text from the file" + filePath.getFileName()+ "::"+output);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try{
                readChannel.close();
            }
            catch (IOException e){
                throw new RuntimeException(e);
            }
        }

    }
}
