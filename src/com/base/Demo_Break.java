package com.base;

public class Demo_Break {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            if (i == 4){
                System.out.println("i =" + i);
                //break;
                //continue;
                return;
            }
            System.out.println("---------");
        }
    }
}
