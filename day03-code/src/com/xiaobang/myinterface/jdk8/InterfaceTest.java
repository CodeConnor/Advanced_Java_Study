package com.xiaobang.myinterface.jdk8;

public class InterfaceTest {
    public static void main(String[] args) {
        AInterImpl A = new AInterImpl();
        A.method();

        AAA.function();
    }
}
interface AAA {
    default void method() {
        System.out.println("AAA...method...");
    }

    static void function() {
        System.out.println("AAA...function...");
    }
}

interface Inter {
    void show();
    void print();

    default void method () {
        System.out.println("Inter...method...");
    }
}

class AInterImpl implements Inter, AAA {

    @Override
    public void method() {
        Inter.super.method();
        AAA.super.method();
    }

    @Override
    public void show() {
        System.out.println("A...show...");
    }

    @Override
    public void print() {
        System.out.println("A...print...");
    }

}


class BInterImpl implements Inter {

    @Override
    public void show() {
        System.out.println("B...show...");
    }

    @Override
    public void print() {
        System.out.println("B...print...");
    }
}