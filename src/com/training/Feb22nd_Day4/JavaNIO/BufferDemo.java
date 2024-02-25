package com.training.Feb22nd_Day4.JavaNIO;

import java.nio.CharBuffer;
public class BufferDemo {
    public static void main(String... args){
        CharBuffer buffer = CharBuffer.allocate(8);
        String text = "Example";
        System.out.println("Input text: "+text);

        for (int i=0; i<text.length(); i++){
            char c = text.charAt(i);
            buffer.put(c);
        }
        System.out.println("Position after buffer written: "+buffer.position());
        // you will get seven as you have added six values

        //to get out of the written state, try printing without this -->
        //you will get garbage value (remaining capacity)
        //change value of capacity and try
        buffer.flip();

        System.out.println("Position after buffer Flip: "+buffer.position());
        // you will get zero as you have added six values

        while(buffer.hasRemaining()){
            System.out.print(buffer.get());
        }
    }

}
