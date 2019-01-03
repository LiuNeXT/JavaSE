package com.heima.Base.Day24;

public class Demo3_Sleep {
    public static void main(String[] args) throws InterruptedException {

        //demo1();
        new Thread() {
            public void run() {
                for (int i = 0; i < 10; i++) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(getName() + " " + i + "aaa");
                }
            }
        }.start();

        new Thread() {
            public void run() {
                for (int i = 0; i < 10; i++) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(getName() + " " + i + "bbb");
                }
            }
        }.start();
    }

    public static void demo1() throws InterruptedException {
        for (int i = 20; i >= 0; i--) {
            //线程睡眠
            Thread.sleep(1000);
            System.out.println(i);

        }
    }
}
