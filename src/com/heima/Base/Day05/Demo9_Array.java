package com.heima.Base.Day05;
/*
 * A:案例演示
 * 数组获取最值(获取数组中的最大值最小值)
 */
public class Demo9_Array {
    public static void main(String[] args) {
        int[] arr = {12,15,33,55,79,90,44};
        int max =getMax(arr);
        System.out.println(max);
    }

    public static int getMax(int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
}
