package com.stream.byteStream.outputStream;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamDemo {

    public static void main(String[] args) {
        File file = new File(
                        "/home/gaian/Documents/workspace-spring-tool-suite-4-4.6.0.RELEASE/Stream/Files/Files/StreamBO.txt");
        String str = "Last desk, First then second me,  \"less wanted then dog\" ";
        writeString(file, str);
        writeBytes(file, str);
    }

    public static void writeString(File file, String str) {
        try {
            FileOutputStream fos = new FileOutputStream(file);
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            bos.write(str.getBytes());
            bos.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void writeBytes(File file, String str) {
        try {
            FileOutputStream fos = new FileOutputStream(file);
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            bos.write(65);
            bos.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
