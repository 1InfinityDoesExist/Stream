package com.stream.byteStream.outputStream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;


public class FileOutputStreamDemo {

    public static void main(String[] args) {

        File file = new File(
                        "/home/gaian/Documents/workspace-spring-tool-suite-4-4.6.0.RELEASE/Stream/Files/Files/StreamSample.txt");
        Impl impl = new Impl();
        impl.writeBytes(file);
        impl.writeString(file);
    }
}


class Impl {
    public void writeBytes(File file) {
        try {
            OutputStream os = new FileOutputStream(file);
            os.write(65);
            os.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeString(File file) {
        String str = "Destroy the system that created it.!!!!";
        try {
            OutputStream outputStream = new FileOutputStream(file);
            outputStream.write(str.getBytes());
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
