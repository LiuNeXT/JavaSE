package com.heima.Base.Day34;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockThreads implements Runnable {

    private int ticket =200;

    private  Lock lock = new ReentrantLock();

    public static void main(String[] args) {
        LockThreads t =new LockThreads();
        Thread t1= new Thread(t,"窗口1");
        Thread t2= new Thread(t,"窗口2");
        Thread t3= new Thread(t,"窗口3");
        t1.start();
        t2.start();
        t3.start();

    }

    @Override
    public void run() {
            while (true){
                try{
                lock.lock();
                if (ticket>0){
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+"正在出售第"+(ticket--)+"张票");
                }else {
                    System.out.println("break之前");
                    break;
                }}
                finally {
                    lock.unlock();
                    System.out.println("finally Lock 解锁之后");
                }
            }
        }
    }
