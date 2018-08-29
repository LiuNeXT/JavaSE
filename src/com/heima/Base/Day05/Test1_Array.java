package com.heima.Base.Day05;
/*
 * A:案例演示
 * 需求：二维数组遍历

 * 外循环控制的是二维数组的长度，其实就是一维数组的个数。
 * 内循环控制的是一维数组的长度。

 */
public class Test1_Array {
    public static void main(String[] args) {
        int [][] arr = {{1,2,3},{4,5},{6,7,8,9}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]);
            }

        }
    }

}
