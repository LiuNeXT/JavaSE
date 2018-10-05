package com.heima.Base.Day07;

public class Demo3_Person {
    public static void main(String[] args) {

    }
}

class Demo_Person3 {
    private String name;
    private int age;

    public Demo_Person3() {       //空参构造
    }

    public Demo_Person3(String name, int age) {   //有参构造
        this.name=name;
        this.age=age;
    }

    public void setName(String name){    //Set跟Get方法
        this.name=name;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age=age;
    }

    public int getAge(){
        return age;
    }
}
