package com.heima.Base.Day23;

import java.io.File;
import java.util.Scanner;

public class Test1 {


    public static void main(String[] args) {

        System.out.println(getDir("/Users/devloper/Code/Base/asdsdad"));

    }

    public static String getDir(String path) {
        while (true) {
            File dir = new File(path);
            //对file对象判断
            if (!dir.exists()) {
                System.out.println("您录入的文件夹路径不存在,请输入一个文件夹路径:");
                break;
            } else if (dir.isFile()) {
                System.out.println("你录入的是文件,请输入路径");
                break;
            }
        }
        return path;
    }

    public static long getFileSum(File dir) {
        long len = 0;
        File[] files = dir.listFiles();
        for (File file : files) {
            if (file.isFile()) {
                //文件字符相加
                len = len + file.length();
            } else {
                //5,判断是文件夹,递归调用
                len = len + getFileSum(file);
            }
        }
        return len;
    }
}
