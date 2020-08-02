package com.atguigu.design.builder.builders;

import com.atguigu.design.builder.pojo.House;

public abstract class HouseBuilder {

    public House house = new House();


    public abstract void makeFoundation();

    public abstract void makeWall();

    public abstract void makeRoof();



    public House build(){
        return house;
    }

}
