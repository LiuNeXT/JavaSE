package com.heima.Base.Day24;

public class Demo1_Thread  extends  Thread{

    private  String threadName;

    public  Demo1_Thread(String threadName){
        this.threadName = threadName;
    }

    @Override
    public void run() {

        for (int i = 0; i < 1000; i++) {
            try {
                System.out.println(threadName + "运行第"+i+"次");
                Thread.sleep((int)Math.random()*10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    public static void main(String[] args) {
        Demo1_Thread thread1 = new Demo1_Thread("A");
        Demo1_Thread thread2 = new Demo1_Thread("B");
        thread1.start();
        thread2.start();


    }
}
