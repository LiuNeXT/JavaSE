package com.heima.Base.Day05;
/*
 * A:案例演示
 * 数组元素反转(就是把元素对调)
 */
public class Demo10_Array {
    public static void main(String[] args) {
        int[] arr = {11,22,33,98,76,45};
        reverseArray(arr);
        print(arr);
    }
    /*
	数组元素反转
	1,明确返回值类型void
	2,明确参数列表int[] arr
	*/
    public static  void reverseArray(int[] arr){
        for (int i = 0; i < arr.length/2; i++) {
            //arr[0]和arr[arr.length-1-0]交换
            //arr[1]和arr[arr.length-1-1]交换
            //arr[2]和arr[arr.lentth-1-2]
            //...
            int temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }
    }

    public static void print(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
    }

}
