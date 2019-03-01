package com.heima.Base.Day31;

import java.util.List;

public class Classroom {

    private String classroomName;

    private Integer classroomNumber;

    private List<User> userList;

    public Classroom(String classroomName, Integer classroomNumber, List<User> userList) {
        this.classroomName = classroomName;
        this.classroomNumber = classroomNumber;
        this.userList = userList;
    }

    public Classroom() {

    }

    public String getClassroomName() {

        return classroomName;
    }

    public void setClassroomName(String classroomName) {
        this.classroomName = classroomName;
    }

    public Integer getClassroomNumber() {
        return classroomNumber;
    }

    public void setClassroomNumber(Integer classroomNumber) {
        this.classroomNumber = classroomNumber;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }
}
