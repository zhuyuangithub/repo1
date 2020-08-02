package com.atguigu.design.adapter.classadapter;

public class Adapter  implements Voltage5V{

    private Voltage220V voltage220V;

    public Adapter(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    public Adapter(){

    }

    public void recharge5V() {
        voltage220V.recharge220V();
    }


}
