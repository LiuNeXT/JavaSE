package com.heima.Base.Day24;

public class Demo4_Daemon {
    public static void main(String[] args) {

        Thread t1 = new Thread() {
            public void run() {
                for (int i = 0; i < 2; i++) {
                    System.out.println(getName() + "..aa");
                }
            }
        };

        Thread t2 = new Thread() {
            public void run() {
                for (int i = 0; i < 50; i++) {
                    System.out.println(getName() + "   "+i+ "...bb");
                }
            }
        };

        t2.setDaemon(true);
        t1.start();
        t2.start();
    }


}
