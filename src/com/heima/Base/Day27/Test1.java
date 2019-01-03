package com.heima.Base.Day27;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class Test1 {

    /**
     * @param args
     * ArrayList<Integer>的一个对象，在这个集合中添加一个字符串数据，如何实现呢？
     * 泛型只在编译期有效,在运行期会被擦除掉
     * @throws Exception
     */
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(111);
        arrayList.add(222);

        Class<?> aClassc = Class.forName("java.util.ArrayList");
        Method method = aClassc.getMethod("add", Object.class);
        Method remove = aClassc.getMethod("remove", int.class);
        //新增字符类型abc放到数组
        method.invoke(arrayList,"abc");
        System.out.println(arrayList);
        //删除222，序号为1
        remove.invoke(arrayList, 1);
        System.out.println(arrayList);



    }
}
