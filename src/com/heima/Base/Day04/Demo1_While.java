package com.heima.Base.Day04;

public class Demo1_While {
    public static void main(String[] args) {
        getTen();
        getSum();
        printToTen();
    }

    private static void printToTen() {
        int y = 1;
        while (y <= 10){
            System.out.println("y = " + y);
            y++;
        }
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
