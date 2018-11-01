package com.heima.Base.Day11.bean;

public class Student extends Person {


    public Student(String name, int age) {
        super(name, age);
    }

    public Student() {
        super();
    }

    public void test(){
        Student student = new Student("zhangsan",24);
        Student student1 = new Student();
        student1.setName("foina");
        student1.setAge(25);
        System.out.println(student.toString());
        System.out.println(student1.toString());


    }

    public void test2(){
        test();
    }
}
