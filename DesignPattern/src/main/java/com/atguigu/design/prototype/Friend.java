package com.atguigu.design.prototype;

public class Friend {
    public String age;
    private String color;
    private String name;

    public Friend(String age, String color, String name) {
        this.age = age;
        this.color = color;
        this.name = name;
    }

    public Friend(){

    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



}
