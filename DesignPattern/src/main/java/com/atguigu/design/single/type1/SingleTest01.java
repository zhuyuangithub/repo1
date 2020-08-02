package com.atguigu.design.single.type1;


public class SingleTest01 {

    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2);
        System.out.println(instance.hashCode() == instance2.hashCode());
    }
}


//饿汉式（静态变量)
class Singleton{

    /**
     * 构造器私有化， 不允许new对象实例， 也不允许被继承了；
     */
    private Singleton(){

    }

    private final static Singleton instance = new Singleton();


    public static Singleton getInstance(){
        return instance;
    }

}


