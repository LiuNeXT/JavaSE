package com.heima.Base.Day19;

import java.io.File;

public class Demo1_File {

    /**
     * File(String pathname)：根据一个路径得到File对象
     * File(String parent, String child):根据一个目录和一个子文件/目录得到File对象
     * File(File parent, String child):根据一个父File对象和一个子文件/目录得到File对象
     */


    public static void main(String[] args) {

        demo1();
        demo2();
        File parent = new File("/Users/devloper/");  //目录构建函数
        String child = "WeChat.jpg";
        File file1 = new File(parent,child);
        System.out.println(file1.exists());
        System.out.println(parent.exists());

    }

    public static void demo1() {
        File file = new File("/Users/devloper/WeChat.jpg");
        System.out.println(file.exists());

        File file1 = new File("xxx.txt");
        System.out.println(file1.exists());

    }

    public static void demo2(){
        String parent = "/Users/devloper/";
        String child = "WeChat.jpg";
        File file = new File(parent,child);
        System.out.println(file.exists());

    }
}
