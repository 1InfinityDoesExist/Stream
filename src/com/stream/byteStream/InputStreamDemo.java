package com.stream.byteStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamDemo {
    public static void main(String[] args) {

        File file = new File(
                        "/home/gaian/Documents/workspace-spring-tool-suite-4-4.6.0.RELEASE/Stream/Files/Files/Stream.txt");
        byte[] array = new byte[1024];
        try {
            InputStream inputStream = new FileInputStream(file);
            inputStream.read(array);
            inputStream.close();
            String output = new String(array);
            System.out.println(output);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
