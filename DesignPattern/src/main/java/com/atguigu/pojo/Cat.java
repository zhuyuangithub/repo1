package com.atguigu.pojo;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Cat extends Animal{

    @Override
    public void say() {
        System.out.println("汪汪汪...");
    }

    public void eat(){
        System.out.println("吃了个骨头...");
    }
}
