package com.atguigu.design.proxy.staticProxy;

public class Client {

    public static void main(String[] args) {

        ProxyClassForEat proxyClass = new ProxyClassForEat(new MyEat());

        proxyClass.eat();

    }
}
