package com.atguigu.design.factory.abstact;


public abstract class Apizza {
        private String name;

        public abstract void prepare();

        public void cookie(){
            System.out.println(name + "在烹饪中..");
        };
        public void cut(){
            System.out.println(name + "在剪切中..");
        };
        public void box(){
            System.out.println(name + "在装箱中..");
        };

        public void setName(String name) {
            this.name = name;
        }

}
