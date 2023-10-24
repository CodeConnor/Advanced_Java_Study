package com.xiaobang.test;

public class Test2 {
    public static void main(String[] args) {
        Coder c = new Coder("张三", 23, 15000);
        System.out.println(c.work());

        Manager m = new Manager("李四", 24, 18000, 5000);
        System.out.println(m.work());
    }
}
