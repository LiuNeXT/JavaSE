package com.heima.Base.Day05;

public class Demo2_Array {
    public static void main(String[] args) {
        int[] arr = new int[8];         //动态初始化,在内存中开辟连续的5块空间
        System.out.println(arr[0]);     //系统给出默认初始化值,整数类型的都是0
        arr[0] = 10;
        System.out.println(arr[0]);
        System.out.println(arr);  //[I@19bb25a,[代表是数组,几个就代表几维,I代表是int类型, @是固定的,  19bb25a代表的是数组的地址值
    }
}
