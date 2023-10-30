package com.xiaobang.polymorphism;

public class PolymorphismTest2 {
    public static void main(String[] args) {
        Father f = new Son();
        System.out.println(f.num);  // 变量看父类
        f.show();  // 方法看子类


        System.out.println("-------------------------");
        Inter i = new InterImpl();
        i.method();  // 抽象方法也可以使用多态


    }
}

class Father {
    int num = 10;

    public void show() {
        System.out.println("show...FFF");
    }
}

class Son extends Father {
    int num = 20;

    public void show() {
        System.out.println("show...SSS");
    }
}


interface Inter {
    void method();
}

class InterImpl implements Inter {

    @Override
    public void method() {
        System.out.println("method.....");
    }
}
