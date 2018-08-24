package com.base;

public class Demo_ForFor {
    public static void main(String[] args) {
        //请输出一个4行5列的星星(*)图案
        getStart();
        //输出由小到大的星星
        for (int i = 1; i <= 5 ; i++) {       //外循坏觉得行数
            for (int j = 1; j <= i; j++) {    //内循坏觉得列数
                System.out.print("*");
            }
            System.out.println();             //光标换到下一行

        }
    }

    private static void getStart() {
        for (int i = 1; i <= 4; i++) {   //外循坏
            for (int j = 1; j <= 5; j++) {     //内循环
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
