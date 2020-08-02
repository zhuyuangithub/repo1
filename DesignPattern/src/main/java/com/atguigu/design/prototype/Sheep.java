package com.atguigu.design.prototype;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;

public class Sheep implements Cloneable,Serializable{
    public String age;
    private String color;
    private String name;
    public Friend friend;


    public Sheep(String age, String color, String name) {
        this.age = age;
        this.color = color;
        this.name = name;
    }

    public Sheep(){

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

    @Override
    public String toString() {
        return "Sheep{" +
                "age='" + age + '\'' +
                ", color='" + color + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    protected Sheep clone() throws CloneNotSupportedException {
        return (Sheep) super.clone();
    }

    
    public Sheep jsonClone() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        String s = objectMapper.writeValueAsString(this);
        System.out.println(s);
        Sheep sheep = objectMapper.readValue(s, this.getClass());
        return sheep;
    }

    public Sheep deepClone(){

        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;


        try {
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);

            Sheep o = (Sheep) ois.readObject();

            return o;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }  finally {
            try {
                bos.close();
                oos.close();
                bis.close();
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
