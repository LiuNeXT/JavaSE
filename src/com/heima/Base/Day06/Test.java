package com.heima.Base.Day06;

public class Test {

    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.getAge()+person.getName());
        person.setName("holiday");
        person.setAge(11);
        System.out.println(person.getAge()+person.getName());
    }
}
