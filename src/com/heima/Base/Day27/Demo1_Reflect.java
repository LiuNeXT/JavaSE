package com.heima.Base.Day27;

import com.heima.Base.Day06.Person;

public class Demo1_Reflect {

    public static void main(String[] args) throws ClassNotFoundException {
        Class class1 = Class.forName("com.heima.Base.Day06.Person");
        Class class2 = Person.class;

        Person person = new Person();
        Class class3 = person.getClass();
        person.toString();

        System.out.println(class1 == class2);
        System.out.println(class1 == class2);


    }
}
