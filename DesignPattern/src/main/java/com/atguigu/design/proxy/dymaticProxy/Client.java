package com.atguigu.design.proxy.dymaticProxy;

public class Client {

    public static void main(String[] args) {

        ProxyClassForEat proxyClass = new ProxyClassForEat();


        IProxy proxyInstance = (IProxy) proxyClass.getProxyInstance(new MyEat());

        proxyInstance.eat();

    }
}
