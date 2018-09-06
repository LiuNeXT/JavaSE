package com.heima.Base.Day06;

public class Person {
    //私有属性
    private String name;
    private int age;

    //无参构造
    public Person(){}
    //有参构造
    public  Person(String name,int age){
        this.name = name;
        this.age = age;
    }
    //Get方法
    public String getName() {
        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {

        this.age = age;
    }

    protected void print(){

        System.out.println("Print");
    }
}
