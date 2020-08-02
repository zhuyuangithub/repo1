package com.atguigu.design.proxy.test;

import java.util.List;

public class TeacherProxy {

    private String name ;

    private int age;

    public String sex;

    private List CourseList;

    private TeacherProxy() {

    }

    public TeacherProxy(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }


    public TeacherProxy(String name, int age, String sex, List courseList) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        CourseList = courseList;
    }

    public void doTeach(){
        System.out.println("我在教学呢....");
    }

    private void doTeach(String name){
        System.out.println("我在给" + name +"教学呢....");
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public List getCourseList() {
        return CourseList;
    }

    public void setCourseList(List courseList) {
        CourseList = courseList;
    }

    @Override
    public String toString() {
        return "TeacherProxy{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", CourseList=" + CourseList +
                '}';
    }
}
