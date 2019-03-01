package com.heima.Base.Utils;

public class Parent_Child {

    public static void main(String[] args) {
        Parent p1 = new Parent();
        p1.eat();
        System.out.println("----------------");
        Parent p2 = new Child();
        p2.eat();
        System.out.println("----------------");
        Parent p3 = new Child("Tian",54);
        p3.eat();

    }
}
