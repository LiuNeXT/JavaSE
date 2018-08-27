package com.heima.Base.Day04;

import java.util.Scanner;

public class Test1_switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的値");
        int x = sc.nextInt();
        //* A:整数(给定一个值,输出对应星期几)
        switch (x) {
            case 1:
                System.out.println("星期一");
                break;
            case 2:
                System.out.println("星期二");
                break;
            case 3:
                System.out.println("星期三");
                break;
            case 4:
                System.out.println("星期四");
                break;
            case 5:
                System.out.println("星期五");
                break;
            case 6:
                System.out.println("星期六");
                break;
            case 7:
                System.out.println("星期日");
                break;
            default:
                System.out.println("对不起没有对应的星期");
                break;
        }
    }
}
