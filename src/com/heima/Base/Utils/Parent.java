package com.heima.Base.Utils;

public class Parent {

    private String name;

    private Integer age;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }


    public Parent (){
        System.out.println("这是父类无参构造");
    }

    public Parent(String name, Integer age) {
        System.out.println("这是父类有参构造函数"+ name+"  "+ age);
        this.name = name;
        this.age = age;
    }

    public  void  eat(){
        System.out.println("父类吃东西方法");
    }

}
