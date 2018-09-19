package com.heima.Base.Day09;

public class Demo1_InterFace {

    public static void main(String[] args) {
        ////Inter i = new Inter();		//接口不能被实例化,因为调用抽象方法没有意义
        Inter inter = new Demo();       //父类引用指向子类对象
        inter.print();
    }
}


interface Inter{
    //public abstract void print();==等同于下面语句，默认省略public abstract
    void print();
}

class Demo implements Inter{
    @Override //重写接口Inter中的print方法
    public void print() {
        System.out.println("Print");
    }
}