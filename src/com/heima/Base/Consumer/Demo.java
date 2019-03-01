package com.heima.Base.Consumer;

/**
 * @author ：lzy
 * @date ：Created in 2019/3/1 13:31
 * @description：
 * @modified By：
 */
public class Demo {

    public static void main(String[] args) {
        Man man = new Person().setname("123").setAge(123).built();
        System.out.println(man);
    }
}
