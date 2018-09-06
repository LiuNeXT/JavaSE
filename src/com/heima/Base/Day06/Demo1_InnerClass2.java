package com.heima.Base.Day06;

public class Demo1_InnerClass2 {
    public static void main(String[] args) {
        //外部类名.内部类名 对象名 = 外部类名.内部类对象;
        Outer3.Inner oi = new Outer3.Inner();
        oi.method();
        //内部类里面静态方法的访问特点:外部类.内部类.静态方法名();
        Outer3.Inner2.print();
    }
}

class Outer3 {
    static class Inner {
        public void method() {
            System.out.println("method");
        }
    }

    static class Inner2 {
        public static void print() {
            System.out.println("print");
        }
    }
}
