package com.stream.byteStream.inputStream;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInputStreamDemo {
    public static void main(String[] args) {
        File file = new File(
                        "/home/gaian/Documents/workspace-spring-tool-suite-4-4.6.0.RELEASE/Stream/Files/Files/Stream.txt");
        way1(file);
        way2(file);
    }

    public static void way1(File file) {
        try {
            FileInputStream fis = new FileInputStream(file);
            BufferedInputStream bis = new BufferedInputStream(fis);
            int iter = 0;
            while ((iter = bis.read()) != -1) {
                System.out.print((char) iter);
            }
            bis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void way2(File file) {
        byte[] output = new byte[1024];
        try {
            FileInputStream fis = new FileInputStream(file);
            BufferedInputStream bis = new BufferedInputStream(fis);
            bis.read(output);
            System.out.println(new String(output));
            bis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
