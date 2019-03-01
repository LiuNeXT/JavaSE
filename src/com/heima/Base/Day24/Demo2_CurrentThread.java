package com.heima.Base.Day24;

public class Demo2_CurrentThread {
    public static void main(String[] args) {
        new Thread(){
            public void run(){
                System.out.println("aaaa");
            }
        }.start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                //Thread.currentThread()获取当前正在执行的线程
                System.out.println(Thread.currentThread().getName());
            }
        }).start();

        Thread.currentThread().setName("我是主线程");
        System.out.println(Thread.currentThread().getName());
    }
}
