package com.xiaobang.myextends.constructor;

public class Test {
    public static void main(String[] args) {
        Son S1 = new Son();
        Son S2 = new Son(1);
    }
}

class Father {
    public Father() {
        System.out.println("Father类的空参构造方法");
    }

    public Father(int num) {
        System.out.println("Father类的带参构造方法----");
    }
}

class Son extends Father{
    public Son() {
        System.out.println("Son类的空参构造方法");
    }

    public Son(int num) {
        System.out.println("Son类的带参构造方法----");
    }
}
