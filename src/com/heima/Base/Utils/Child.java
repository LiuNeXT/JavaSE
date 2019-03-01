package com.heima.Base.Utils;

public class Child extends Parent {

    private  String name;

    private  Integer age;


    public Child(){
        System.out.println("这个是子类无参构造函数");
    }

    public Child(String name, Integer age) {
        super(name,age);
        this.name = name;
        this.age = age;
        System.out.println("这个是子类的有参构造方法");
    }


    public  void  eat (){
        System.out.println("子类吃东西方法");
    }

}
