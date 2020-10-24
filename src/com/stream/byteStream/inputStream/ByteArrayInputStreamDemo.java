package com.stream.byteStream.inputStream;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import org.apache.commons.io.FileUtils;

public class ByteArrayInputStreamDemo {
    public static void main(String[] args) {
        File file = new File(
                        "/home/gaian/Documents/workspace-spring-tool-suite-4-4.6.0.RELEASE/Stream/Files/Files/Stream.txt");
        demo1(file);
        System.out.println(":::::::::::::::::::::::::::::");
        demo2(file);
    }

    private static void demo2(File file) {
        try {
            byte[] byteArray = new byte[1024];
            InputStream is = new ByteArrayInputStream(FileUtils.readFileToByteArray(file));
            is.read(byteArray);
            is.close();
            System.out.println(new String(byteArray));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void demo1(File file) {
        try {
            InputStream is = new ByteArrayInputStream(FileUtils.readFileToByteArray(file));
            int iter = 0;
            while ((iter = is.read()) != -1) {
                System.out.print((char) iter);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
