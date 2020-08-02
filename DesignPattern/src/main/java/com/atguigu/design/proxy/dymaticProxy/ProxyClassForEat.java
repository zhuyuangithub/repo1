package com.atguigu.design.proxy.dymaticProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyClassForEat{

    private Object object123;

    public static Object getProxyInstance(final Object object){

        InvocationHandler in = new InvocationHandler() {
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("吃饭之前我先刷了刷牙....");


                Object result = method.invoke(object, args);


                System.out.println("吃饭之后我抽了根烟.....");


                return result;
            }
        };


        return Proxy.newProxyInstance(object.getClass().getClassLoader(), object.getClass().getInterfaces(),in);
    }





}
