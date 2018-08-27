package com.heima.Base.Day04;

/*
 * A:案例演示
 * 需求：比较两个数据是否相等。
 * 参数类型分别为两个int类型，两个double类型，并在main方法中进行测试

 */
public class Test3_OverLoad {

    public static void main(String[] args) {

        boolean b1 = isEquals(10,10);
        System.out.println(b1);

        boolean b2 = isEquals(10.5,10.5);
        System.out.println(b2);
    }

    public static boolean isEquals(int a,int b){
        return a ==b ;
    }

    public static boolean isEquals(double a,double b){
        return a == b;
    }
}
