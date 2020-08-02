package com.atguigu.design.single.type2;


public class SingleTest02 {

    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2);
        System.out.println(instance.hashCode() == instance2.hashCode());
    }
}


//饿汉式（静态代码块)
class Singleton{

    /**
     * 构造器私有化， 不允许new对象实例， 也不允许被继承了；
     */
    private Singleton(){

    }

    static{
        instance = new Singleton();
    }

    private static Singleton instance;
  

    public static Singleton getInstance(){
        return instance;
    }

}


