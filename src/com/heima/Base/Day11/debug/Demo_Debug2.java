package com.heima.Base.Day11.debug;

public class Demo_Debug2 {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        change(arr);
        System.out.println(arr[1]);

        String[] str = new String[]{"123"};
        System.out.println(str);

    }

    public static void change(int a, int b) {
        a = b;
        b = a + b;
        System.out.println("a" + a + "," + "b" + b);
    }

    public static void change(int[] arr){
        for (int x = 0; x <arr.length ; x++) {
            if (arr[x] % 2 ==0){
                arr[x] +=2;
            }

        }

    }
}
