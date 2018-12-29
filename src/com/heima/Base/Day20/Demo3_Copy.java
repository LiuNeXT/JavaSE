package com.heima.Base.Day20;

import java.io.*;

public class Demo3_Copy {
    public static void main(String[] args) throws IOException {
        demo1();
    }

    public static void demo1() throws IOException {
        FileInputStream fis = new FileInputStream(new File("/Users/devloper/WeChat.jpg"));
        FileOutputStream fos = new FileOutputStream("copy.jpg");

        int b;
        while ((b = fis.read()) != -1){
            fos.write(b);
        }
        System.out.println("拷贝成功");
        fis.close();
        fos.close();

    }
}
