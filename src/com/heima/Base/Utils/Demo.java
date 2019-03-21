package com.heima.Base.Utils;

public class Demo<T> {


    private  int age;

    private  T data;


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public T getData() {
        return data;
    }


    public void setData(T data) {
        this.data = data;
    }
}
