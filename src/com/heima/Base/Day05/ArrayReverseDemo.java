package com.heima.Base.Day05;

public class ArrayReverseDemo {
    public static void main(String[] args) {
        int[] arr = {11,22,33,44,55};
        int[] newArr = reverseArr(arr);
        for (int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i]);

        }
    }

    public static int[] reverseArr(int[] oldArr){
        int[] newArr = new int[oldArr.length];
        for (int i = 0; i < oldArr.length; i++) {
            newArr[i] = oldArr[oldArr.length -1 -i];
        }
        return newArr;
    }
}
