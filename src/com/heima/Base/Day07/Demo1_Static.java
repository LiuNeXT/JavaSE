package com.heima.Base.Day07;

public class Demo1_Static {
    Demo1_Static_Person p3 = new Demo1_Static_Person();

    p3.name = "福原爱老师";		//调用姓名属性并赋值
    p3.country = "台湾";		//调用国籍属性并赋值
    p3.speak();

    Person p1 = new Person();	//创建对象
    p1.name = "苍老师";			//调用姓名属性并赋值
    p1.country = "日本";		//调用国籍属性并赋值
		p1.speak();

    Person p2 = new Person();
    p2.name = "小泽老师";		//调用姓名属性并赋值
    // p2.country = "日本";		//调用国籍属性并赋值
		p2.speak();

    Person p4 = new Person();
    p4.name = "黄老师";		//调用姓名属性并赋值
    // p2.country = "日本";		//调用国籍属性并赋值
		p4.speak();

    //Person.country = "日本";	//静态多了一种调用方式,可以通过类名.
    //System.out.println(Person.country);
}


class  Demo1_Static_Person{
    String name;
    static String country;

    public void speak(){
        System.out.println(name+"...."+country);
    }

}

