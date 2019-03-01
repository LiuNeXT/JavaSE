package com.heima.Base.Consumer;

/**
 * @author ：lzy
 * @date ：Created in 2019/3/1 13:28
 * @description：
 * @modified By：
 */
public class Man {

    private  String name;

    private  Integer age;

    Man(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }
}
