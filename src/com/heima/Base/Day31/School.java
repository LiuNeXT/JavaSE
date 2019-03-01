package com.heima.Base.Day31;

public class School<T> {


    private String schoolName;


    private T data;

    public School(){

    }

    public School(String schoolName, T data) {
        this.schoolName = schoolName;
        this.data = data;
    }

    public String getSchoolName() {

        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
