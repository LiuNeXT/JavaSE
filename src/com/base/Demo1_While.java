package com.base;

public class Demo1_While {
    public static void main(String[] args) {
        getTen();
        getSum();
    }

    private static void getTen() {
        int x = 1;
        while (x <= 10) {
            System.out.println("x = " + x);
            x++;
        }

    }

    public  static void getSum(){
        int sum = 0;
        int i = 1;
        while (i <=100 ){
            sum += i;
            i++;

        }
        System.out.println("sum = " + sum);
    }
}
