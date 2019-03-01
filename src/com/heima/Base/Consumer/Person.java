package com.heima.Base.Consumer;

/**
 * @author ：lzy
 * @date ：Created in 2019/3/1 13:28
 * @description：
 * @modified By：
 */
public class Person {

    private  String name;


    private  Integer age;

    public Person setname(String name){
        this.name = name;
        return this;

    }

    public Person setAge(Integer age){
        this.age = age;
        return this;
    }

    public Man built(){
        return new Man(name,age);
    }
}
