package com.heima.Base.Day24;

public class Demo2_Thread {

    public static void main(String[] args) {

        MyThread myThread = new MyThread();
        myThread.run();
    }


    static class MyThread extends Thread {
        public void run() {
            for (int i = 0; i < 100; i++) {
                System.out.println("aaa");
            }
        }
    }
}
