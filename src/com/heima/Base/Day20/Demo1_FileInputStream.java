package com.heima.Base.Day20;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo1_FileInputStream {

    public static void main(String[] args) throws IOException {
        //demo1();
        FileInputStream fis = new FileInputStream(new File("/Users/devloper/WeChat.jpg"));
        int i;
        while ((i = fis.read()) != -1){
            System.out.println(i);
        }
        fis.close();

    }

    public static void demo1() throws IOException {
        FileInputStream fis = new FileInputStream(new File("/Users/devloper/WeChat.jpg"));
        int x = fis.read();                                        //从硬盘上读取一个字节
        System.out.println(x);
        int y = fis.read();
        System.out.println(y);
        int z = fis.read();
        System.out.println(z);
        int a = fis.read();
        System.out.println(a);
        int b = fis.read();
        System.out.println(b);
        int c = fis.read();
        System.out.println(c);
        fis.close();   //关闭流资源

    }
}
