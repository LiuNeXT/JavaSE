package com.heima.Base.Day07;

import javax.annotation.Resource;
import java.io.File;
import java.io.FilterInputStream;
import java.util.ArrayList;

class Demo_Person3 {



    public static void main(String[] args) {

    }


    private int age;

    private String name;

    public Demo_Person3() {       //空参构造
    }

    public Demo_Person3(String name, int age) {   //有参构造
        this.name = name;
        this.age = age;
    }


    public void setName(String name) {    //Set跟Get方法
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override


    public String toString() {
        return "Demo_Person3{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


}
