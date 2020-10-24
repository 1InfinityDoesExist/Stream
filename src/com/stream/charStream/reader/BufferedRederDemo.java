package com.stream.charStream.reader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import org.apache.commons.io.FileUtils;

public class BufferedRederDemo {
    public static void main(String[] args) {
        File file = new File(
                        "/home/gaian/Documents/workspace-spring-tool-suite-4-4.6.0.RELEASE/Stream/Files/Files/StreamSample.txt");
        /*
         * Reading bytes by bytes, a character at a time
         */
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            int iter = 0;
            while ((iter = bufferedReader.read()) != -1) {
                System.out.print((char) iter);
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        /*
         * Reading line by line
         */

        StringBuffer sb;
        try {
            InputStreamReader isr = new InputStreamReader(FileUtils.openInputStream(file));
            BufferedReader br = new BufferedReader(isr);
            sb = new StringBuffer();
            String input;
            while ((input = br.readLine()) != null) {
                sb.append(input);
            }
            System.out.println(sb.toString());
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
