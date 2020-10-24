package com.stream.byteStream.outputStream;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class ByteArrayOutputStreamDemo {
    public static void main(String[] args) {
        BAOSDemo impl = new BAOSDemo();
        impl.execute1();
    }
}


class BAOSDemo {
    public void execute1() {
        String str = "You should have trusted me to finish the job, James Bond!!!!";
        OutputStream outputStream = new ByteArrayOutputStream();
        byte[] byteArray = str.getBytes();
        try {
            outputStream.write(byteArray);
            System.out.println(outputStream.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
