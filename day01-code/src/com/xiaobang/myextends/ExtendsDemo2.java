package com.xiaobang.myextends;

public class ExtendsDemo2 {
    public static void main(String[] args) {
        Son s = new Son();
        s.method();
        s.show();
    }

}

class Father {
    int num = 10;
    public void show() {
        System.out.println("show....f");
    }
}

class Son extends Father {
    int num = 20;

    public void method() {
        int num = 30;
        System.out.println(num);        // 30
        System.out.println(this.num);   // 20
        System.out.println(super.num);  // 10
    }

    public void show() {
        System.out.println("show....s");
    }
}