package com.heima.Base.Day24;

import java.util.ArrayList;
import java.util.List;

public class Demo2_Thread {

    private  static List<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.run();
    }


    static class MyThread extends Thread {
        public void run() {
            for (int i = 0; i < 1000; i++) {
                list.add(i);
                System.out.println(i);
                System.out.println(currentThread().getName());
                System.out.println("-----------");
            }
        }
    }
}
