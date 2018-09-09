package com.heima.Base.Day06;

public class Person {
    /*
     * A:案例演示
     * 构造方法的重载
     * 重载:方法名相同,与返回值类型无关(构造方法没有返回值),只看参数列表
     * B:构造方法注意事项
     * a:如果我们没有给出构造方法，系统将自动提供一个无参构造方法。
     * b:如果我们给出了构造方法，系统将不再提供默认的无参构造方法。
     * 注意：这个时候，如果我们还想使用无参构造方法，就必须自己给出。建议永远自己给出无参构造方法
     */
    private String name;
    private int age;
    //构造方法
    public Person(){}
    //有参构造方法
    public  Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    protected void print(){
        System.out.println("Print");
    }
}
