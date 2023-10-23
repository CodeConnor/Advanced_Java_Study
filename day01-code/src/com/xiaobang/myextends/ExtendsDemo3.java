package com.xiaobang.myextends;

import org.w3c.dom.ls.LSOutput;

public class ExtendsDemo3 {
    public static void main(String[] args) {
        C c = new C();
        c.methodC();
        c.methodB();
        c.methodA();
    }
}

class A {
    public void methodA() {
        System.out.println("AAA");
    }
}

class B extends A{
    public void methodB(){
        System.out.println("BBB");
    }
}

class C extends B{
    public void methodC() {
        System.out.println("CCC");
    }
}
