package com.heima.Base.Day05;

import java.util.Scanner;

/*
 * A:案例演示
 * 数组查表法(根据键盘录入索引,查找对应星期)
 */
public class Demo11_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数字1-7");
        int week = sc.nextInt();
        System.out.println("星期"+ getWeek(week));
    }
    /*
	根据索引返回对应的星期
	1,返回值类型char
	2,参数列表int week
	*/
    public static char getWeek(int week){
        char[] arr = {' ','一','二','三','四','五','六','日'};
        return arr[week];
    }
}
