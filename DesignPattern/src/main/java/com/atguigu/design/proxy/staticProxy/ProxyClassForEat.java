package com.atguigu.design.proxy.staticProxy;

public class ProxyClassForEat implements IProxy{

    MyEat myEat;

    public ProxyClassForEat(MyEat myEat) {
        this.myEat = myEat;
    }

    public void eat() {

        System.out.println("吃饭之前我先刷了刷牙....");


        myEat.eat();


        System.out.println("吃饭之后我抽了根烟.....");
    }


}
