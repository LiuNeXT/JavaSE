package com.heima.Base.Day34;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestThread {


    public static void main(String[] args) {

        //noSync();
    }


    public static  void  sync(){
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i <10 ; i++) {
            Runnable runnable = new Runnable() {
                @Override
                public void run() {
                    System.out.println("这个是第"+Thread.currentThread().getName()+"条线程");
                    System.out.println("========================");
                }
            };
            executorService.execute(runnable);
        }
    }


    public static  void  noSync(){
        for (int i = 0; i < 10; i++) {
            int j = i;
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println("这个是第"+Thread.currentThread().getName()+"条线程"+j);
                    System.out.println("========================");
                }
            });
            thread.start();
        }
    }
}
