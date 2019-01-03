package com.heima.Base.Day24;

public class Demo1_Name {

    public static void main(String[] args) {
        //demo1();
        Thread thread1 = new Thread(){
            public void run(){
                System.out.println(this.getName()+"aa");
            }
        };
        Thread thread2 = new Thread(){
            public void run(){
                System.out.println(this.getName()+"bbb");
            }
        };

        thread1.setName("alex");
        thread2.setName("fiona");
        thread1.start();
        thread2.start();

    }

    //启动线程任务，打印aaa
    public static  void demo1(){
        new Thread("alex"){    //通过构造方法给name赋值
            public  void  run(){
                System.out.println("aaa");
            }
        }.start();
        new Thread("fiona"){
            public void run(){
                System.out.println("ffff");
            }
        }.start();
    }
}
