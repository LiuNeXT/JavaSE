package com.heima.Base.Utils;

public class ExceptionDemo {

    public static void main(String[] args) {
//        int count = 0;
//        for (int i = 1; i > 0; i++) {
//            count = count + i;
//            if (i==3){
//                break;
//            }
//        }
        int count = 1;
        for (int i = 0; i <100; i++) {
            count = count + i;
            if (count >4000){
                System.out.println("大于4000了");
                System.out.println(count);
                break;
            }
        }

        System.out.println(count);
    }
}
