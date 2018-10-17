package com.heima.Base.Day12;

import java.util.Scanner;

public class Demo1_Scanner {


    /**
     * @param args
     */

    public static void main(String[] args) {

        //创建Scanner对象
        Scanner sc = new Scanner(System.in);  //键盘录入
        //int i = sc.nextInt();               //键盘录入的数据存放在i中
        //System.out.println(i);              //打印

        if (sc.hasNextInt()) {                //判断sc里是否有下一个数
            int i = sc.nextInt();
            System.out.println(i);            //倘若有，就一直打印
        } else {
            System.out.println("输入类型出错");   //否侧就报错
        }
    }
}
