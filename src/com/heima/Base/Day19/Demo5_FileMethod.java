package com.heima.Base.Day19;

import sun.java2d.pipe.SpanShapeRenderer;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo5_FileMethod {

    /**
     * * A:获取功能
     * public String getAbsolutePath()：获取绝对路径
     * public String getPath():获取路径
     * public String getName():获取名称
     * public long length():获取长度。字节数
     * public long lastModified():获取最后一次的修改时间，毫秒值
     * public String[] list():获取指定目录下的所有文件或者文件夹的名称数组
     * public File[] listFiles():获取指定目录下的所有文件或者文件夹的File数组
     */

    public static void main(String[] args) {

        //demo1();
        File dir = new File("/Users/devloper/Pictures");

        String[] list = dir.list();  //获取文件名

        for (String s : list) {
            System.out.println(s);         //获取文件名称
        }

        File[] files = dir.listFiles();    //获取文件
        for (File file : files) {
            System.out.println(file);
        }

    }

    public static  void  demo1(){
        File file1 = new File("gakki.jpg");
        File file2 = new File("/Users/debloper/WeChat.jpg");

        System.out.println(file1.getAbsolutePath()); //获取绝对路径
        System.out.println(file2.getAbsolutePath());

        System.out.println(file1.getPath());					//获取构造方法中传入路径
        System.out.println(file2.getPath());

		System.out.println(file1.getName());					//获取文件或者文件的名字
		System.out.println(file2.getName());

        Date date = new Date(file1.lastModified());        //获取文件时间
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        System.out.println(sdf.format(date));

    }

}
