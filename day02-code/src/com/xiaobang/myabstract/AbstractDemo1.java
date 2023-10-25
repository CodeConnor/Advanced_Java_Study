package com.xiaobang.myabstract;

public class AbstractDemo1 {
    public static void main(String[] args) {
        Cat cc = new Cat();
        cc.eat();

        Dog dd = new Dog();
        dd.eat();

    }
}

abstract class Animal {
    public abstract void eat();
}

class Cat extends Animal{
    public void eat() {
        System.out.println("猫吃鱼");
    }
}

class Dog extends Animal{
    public void eat() {
        System.out.println("狗吃肉");
    }
}
