package com.heima.Base.Day06;

public class Demo1_Package {
    public static void main(String[] args) {
        Person p = new Person("张三",23);
        System.out.println(p.getName() + "...." + p.getAge());
        p.print();

        Student s = new Student("ALex",28);
        System.out.println(s.getName() + "..." + s.getAge());
        s.method();
    }

}
