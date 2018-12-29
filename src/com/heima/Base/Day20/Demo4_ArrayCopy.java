package com.heima.Base.Day20;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo4_ArrayCopy {

    public static void main(String[] args) throws IOException {
        demo1();

    }

    public static void demo1() throws IOException {
        FileInputStream fis = new FileInputStream("copy.jpg");
        FileOutputStream fos = new FileOutputStream("copy-back1.jpg");


        byte[] arr = new byte[1024];
        int len;                                 //如果忘记加arr,返回的就不是读取的字节个数,而是字节的码表值
        while ((len = fis.read(arr)) != -1) {
            fos.write(arr,0,len);           //将文件上的数据读取到字符数组中,将字符数组中的数据写到文件上
        }
        fis.close();
        fos.close();

    }
}
