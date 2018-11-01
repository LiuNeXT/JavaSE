package com.heima.Base.Day11.object;

import com.heima.Base.Day11.bean.Student;

public class Demo_GetClass {
    public static void main(String[] args) {
        Student s = new Student("alex", 28);


        Class<? extends Student> clazz = s.getClass();
        String name = clazz.getName();
        String s1 = clazz.toString();
        System.out.println(name);
        System.out.println(s1);

    }
}
