package com.atguigu.design.prototype;

import com.fasterxml.jackson.core.JsonProcessingException;

public class Client {

    public static void main(String[] args) throws CloneNotSupportedException, JsonProcessingException {

        Sheep sheep1 = new Sheep("12", "黄色", "zhuyuan");
        sheep1.friend = new Friend("13","黑色","yuqian");
        // Sheep sheep2 = sheep1.clone();
        //Sheep sheep2 = sheep1.deepClone(); //序列化实现克隆
        Sheep sheep2 = sheep1.jsonClone();
        System.out.println("sheep1" + sheep1);
        System.out.println("sheep2" + sheep2);
        System.out.println("sheep1的hash值" + sheep1.hashCode() + "||||||" + sheep1.friend.hashCode()+ "||||||" + sheep2.age.hashCode());
        System.out.println("sheep2的hash值" + sheep2.hashCode() + "||||||" + sheep2.friend.hashCode()+ "||||||" + sheep2.age.hashCode());
        System.out.println(sheep1 == sheep2);



    }

}
