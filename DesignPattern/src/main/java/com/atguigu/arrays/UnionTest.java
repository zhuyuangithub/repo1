package com.atguigu.arrays;

public class UnionTest {

    public static void main(String[] args) {

          Animal animal = new Animal();
          new ThreadTest2(animal).start();
          new ThreadTest1(animal).start();

    }
}

class ThreadTest1 extends Thread{

    Animal animal;

    public ThreadTest1(Animal animal){
         this.animal = animal;
    }

    @Override
    public void run() {
        try {
            animal.say();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}

class ThreadTest2 extends Thread{

    Animal animal;

    public ThreadTest2(Animal animal){
        this.animal = animal;
    }
    @Override
    public void run() {
        try {
            animal.eat();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}

class Animal{

    Object object1 = new Object();
    Object object2 = new Object();
    public synchronized void eat() throws InterruptedException {

        synchronized(object1){
            System.out.println("我想吃东西");

            Thread.sleep(3000);
        }

    }

    public void say() throws InterruptedException {
        synchronized(object2){

            System.out.println("我想说我爱你");

            Thread.sleep(3000);
        }
    }
}