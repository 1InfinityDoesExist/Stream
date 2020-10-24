package com.stream.charStream.writer;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import org.apache.commons.io.FileUtils;

public class BufferedWriterDemo {
    public static void main(String[] args) {
        File file = new File(
                        "/home/gaian/Documents/workspace-spring-tool-suite-4-4.6.0.RELEASE/Stream/Files/Files/StreamBr.txt");
        String str = "I should not have left you alone, Hire me or fire me its entirely up to you.!!!!!, \"M\" ";
        way1(file, str);
        way2(file, str);
    }

    public static void way1(File file, String str) {
        try {
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(str);
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void way2(File file, String str) {
        try {
            OutputStreamWriter osw = new OutputStreamWriter(FileUtils.openOutputStream(file));
            BufferedWriter bw = new BufferedWriter(osw);
            bw.write(str);
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
