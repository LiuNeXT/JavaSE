package com.heima.Base.Day31;

import java.util.ArrayList;
import java.util.List;

public class Demo {

    private static List<User> userList = new ArrayList<>();

    private static List<Classroom> classroomList = new ArrayList<>();

    static {
        userList.add(new User("alex",12));
        userList.add(new User("fiona",13));
        userList.add(new User("li",14));
        userList.add(new User("mo",15));
        classroomList.add(new Classroom("语文",1,userList));

    }

    public static void main(String[] args) {
        List<String> classroomList1 = new ArrayList<>();
        for (Classroom classroom : classroomList) {
            String name = classroom.getClassroomName();
            classroomList1.add(name);
        }
        classroomList1.stream().forEach(s -> {
            System.out.println(s);
        });
    }

}
