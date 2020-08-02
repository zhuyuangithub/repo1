package com.atguigu.design.builder.builders;

public class HighBuilder extends HouseBuilder{


    public void makeFoundation() {
        house.setFoundation("别墅的地基");
    }

    public void makeWall() {
        house.setWall("别墅的墙");
    }

    public void makeRoof() {
        house.setRoof("别墅的封顶");
    }
}
