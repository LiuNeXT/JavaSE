package com.heima.Base.Day07;

public class Test2_Employee {
    public static void main(String[] args) {

        Employee wokr1 = new Employee("令狐冲","9527",20000);
        wokr1.work();
    }
}


class Employee{
    private String name;    //姓名
    private String id;      //工号
    private double salary;  //工资

    public Employee(String name, String id, double salary) {      //有参构造
        this.name = name;
        this.id = id;
        this.salary = salary;
    }


    /*
    * Set跟Get方法
    * */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    //ToString方法
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", salary=" + salary +
                '}';
    }

    public void work(){
        System.out.println("我的姓名是:" + name + ",我的工号是:" + id + ",我的工资是:" + salary
                + ",我的工作内容是敲代码");
    }
}
