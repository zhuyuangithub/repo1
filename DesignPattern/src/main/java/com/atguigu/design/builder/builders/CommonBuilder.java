package com.atguigu.design.builder.builders;

public class CommonBuilder extends HouseBuilder{


    public void makeFoundation() {
        house.setFoundation("普通房子的地基");
    }

    public void makeWall() {
        house.setWall("普通房子的墙");
    }

    public void makeRoof() {
        house.setRoof("普通房子的顶");
    }


}
