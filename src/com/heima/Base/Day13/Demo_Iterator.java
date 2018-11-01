package com.heima.Base.Day13;

import com.heima.Base.Day11.bean.Student;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo_Iterator {

    public static void main(String[] args) {

        Collection c = new ArrayList();
        c.add(new Student("zhangsan1",26));
        c.add(new Student("zhangsan2",26));
        c.add(new Student("zhangsan3",26));
        c.add(new Student("zhangsan4",26));
        c.add(new Student("zhangsan5",26));



        Iterator it = c.iterator();
        while (it.hasNext()){
            Student s = (Student) it.next();
            System.out.println(s.getName()+"..."+s.getAge());
        }
    }
}
