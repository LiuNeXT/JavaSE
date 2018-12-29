package com.heima.Base.Day19;

import java.io.File;

public class Demo4_FileMethod {

    /**
     * * A:判断功能
     * public boolean isDirectory():判断是否是目录
     * public boolean isFile():判断是否是文件
     * public boolean exists():判断是否存在
     * public boolean canRead():判断是否可读
     * public boolean canWrite():判断是否可写
     * public boolean isHidden():判断是否隐藏
     * <p>
     * B:案例演示
     * File类的判断功能
     */

    public static void main(String[] args) {

        //demo1();
        File file = new File("zzz");
        file.setReadable(false);
        System.out.println(file.canRead());            //windows系统认为所有的文件都是可读的
        file.setWritable(true);
        System.out.println(file.canWrite());            //windows系统可以设置为不可写

        File file2 = new File("aaa.txt");
        System.out.println(file2.isHidden());            //判断是否是隐藏文件
        System.out.println(file.isHidden());
    }

    public static void demo1() {
        File dir1 = new File("ggg");
        System.out.println(dir1.isDirectory());

        File dir2 = new File("zzz");
        System.out.println(dir2.isDirectory());  //判断是否为文件夹

        System.out.println(dir1.isFile());
        System.out.println(dir1.isFile());


    }
}
