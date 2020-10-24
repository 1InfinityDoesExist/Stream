package com.stream.byteStream.inputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo {
    public static void main(String[] args) {
        File file1 = new File(
                        "/home/gaian/Documents/workspace-spring-tool-suite-4-4.6.0.RELEASE/Stream/Files/Files/Stream.txt");
        FileInputStreamDemo fisDemo = new FileInputStreamDemo();
        fisDemo.demo1(file1);
    }

    private void demo1(File file) {
        try {
            FileInputStream fis = new FileInputStream(file);
            int iter = 0;
            while ((iter = fis.read()) != -1) {
                System.out.print((char) iter);
            }
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
