package com.atguigu.design.adapter.classadapter;

public class Client {

    public static void main(String[] args) {

        Adapter adapter = new Adapter(new Voltage220V());

        Phone phone = new Phone();

        phone.rechargePhone(adapter);

    }
    
}
