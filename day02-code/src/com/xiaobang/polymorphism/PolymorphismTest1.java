package com.xiaobang.polymorphism;

public class PolymorphismTest1 {
    public static void main(String[] args) {
        // 创建父类引用指向子类对象
        // Animal a = new Dog();
        Animal a = new Cat();

        a.eat();  // 注释掉上面任一个对象创建都能执行该方法, 而且根据子类对象的不同, 该方法有不同的表现形式

    }
}

// 创建抽象类
abstract class Animal {
    public abstract void eat();
}


// 创建两个子类继承自抽象类
class Dog extends Animal {

    @Override
    public void eat() {
        System.out.println("狗吃肉");
    }
}

class Cat extends Animal {

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
}
