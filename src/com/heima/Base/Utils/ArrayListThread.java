package com.heima.Base.Utils;

import java.lang.Thread;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListThread implements Runnable {

    //线程不安全
    //private static List<String> list = new ArrayList<>();

    //线程安全的
    private static List<String> list = Collections.synchronizedList(new ArrayList<>());

    public static void main(String[] args) {
        ArrayListThread target = new ArrayListThread();
        for (int i = 0; i < 100; i++) {
            Thread thread = new Thread(target);
            thread.start();
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == null) {
                System.out.println();
            }
            System.out.println(list.get(i) + "");

        }
    }

    @Override
    public void run() {
        try {
            Thread.sleep(20);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        list.add(Thread.currentThread().getName());
    }


}
