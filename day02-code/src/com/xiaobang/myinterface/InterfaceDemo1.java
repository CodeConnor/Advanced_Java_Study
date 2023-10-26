package com.xiaobang.myinterface;

public class InterfaceDemo1 {
    public static void main(String[] args) {
        InterImpl ii = new InterImpl();
        ii.show();
        ii.method();

    }
}

interface Inter {
    public abstract void show();

    public abstract void method();

}

class InterImpl implements Inter {

    @Override
    public void show() {
        System.out.println("show...");
    }

    @Override
    public void method() {
        System.out.println("method...");
    }
}
