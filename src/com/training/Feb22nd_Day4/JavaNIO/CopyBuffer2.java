package com.training.Feb22nd_Day4.JavaNIO;

//Copy data from one channel to another using FileInputStream and ReadableByteChannel


import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
public class CopyBuffer2 {
    public static String sourceFile = "C:\\java-basics\\src\\com\\training\\Feb22nd_Day4\\JavaNIO\\destinationFile.txt";
    public static String destFile = "C:\\java-basics\\src\\com\\training\\Feb22nd_Day4\\JavaNIO\\SourceFile.txt";
    public static Path sourceFilePath = Paths.get(sourceFile) ;
    public static Path destFilePath = Paths.get(destFile) ;

    public static void main(String... args) throws IOException {

        readFile(sourceFilePath);
        writeFile(destFilePath);

//        FileInputStream in = new FileInputStream("bufferFileInputStream.txt");
//        ReadableByteChannel channel = in.getChannel();
    }

    private static void writeFile(Path filePath) throws IOException {
        String input = readFile(filePath);
        //System.out.println("Writing Text: "+filePath.getFileName()+" ::"+input);
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

    private static String readFile(Path filePath) throws IOException {
        //String output="";

        FileChannel readChannel = FileChannel.open(filePath);
        ByteBuffer readBuffer = ByteBuffer.allocate(Math.toIntExact(readChannel.size()));
        try {
            readChannel.read(readBuffer);
            byte[] bytes = readBuffer.array();
            String output = new String(bytes);
            return output;
            //System.out.println("Text from the file" + filePath.getFileName()+ "::"+output);

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
