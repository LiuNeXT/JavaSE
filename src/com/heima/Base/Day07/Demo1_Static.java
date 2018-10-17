package com.heima.Base.Day07;


/**
 *




class Demo1_Static_Person {
    public class Demo1_Static {

        Demo1_Static_Person p3 = new Demo1_Static_Person();
        p3.name ="福原爱老师";        //调用姓名属性并赋值
        p3.country ="台湾";        //调用国籍属性并赋值
    p3.speak();


        //Person.country = "日本";	//静态多了一种调用方式,可以通过类名.
    }
    //System.out.println(Person.country);


    String name;
    static String country;

    public void speak() {
        System.out.println(name + "...." + country);
    }


}
 */
