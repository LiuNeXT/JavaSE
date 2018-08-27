package com.heima.Base.Day04;

import java.util.Scanner;

/*
  * 键盘录入月份，输出对应的季节
  一年有四季
  3,4,5春季
  6,7,8夏季
  9,10,11秋季
  12,1,2冬季
  */
public class Test3_Switchif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);	//创建键盘录入对象
        System.out.println("请输入月份");
        int month = sc.nextInt();				//将键盘录入的结果存储在month

        if (month > 12 || month < 1) {
            System.out.println("对不起没有对应的季节");
        }else if (month >= 3 && month <= 5) {
            System.out.println(month + "月是春季");
        }else if (month >= 6 && month <= 8) {
            System.out.println(month + "月是夏季");
        }else if (month >= 9 && month <= 11) {
            System.out.println(month + "月是秋季");
        }else {
            System.out.println(month + "月是冬季");
        }
    }
}
