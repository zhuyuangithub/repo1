package com.atguigu.design.single.type8;

public class SingletonTest08 {
    public static void main(String[] args) {
        Singleton instance = Singleton.HELLO;
        Singleton instance2 = Singleton.HELLO;
        System.out.println(instance == instance2);
        System.out.println(instance.hashCode() == instance2.hashCode());


    }

}

enum Singleton{

    HELLO,HELLO1,HELLO2,HELLO3;

    Singleton(){
        System.out.println("123");
    }

    public void sayHello(){
        System.out.println("123");
    }

    
}
