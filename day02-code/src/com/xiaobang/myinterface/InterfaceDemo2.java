package com.xiaobang.myinterface;

public class InterfaceDemo2 {
    public static void main(String[] args) {
        ABImpl ab = new ABImpl();
        ab.show();

        SonABImpl sab = new SonABImpl();
        sab.show();

    }
}

// 定义父类
class Father {
    public void show() {
        System.out.println("show F ...");
    }
}

// 定义接口
interface A {
    void show() ;
}

interface B {
    void show();
}

// 一个类实现多个接口
class ABImpl implements A, B {

    @Override
    public void show() {
        System.out.println("show A and B ... ");
    }
}

class SonABImpl extends Father implements A, B {
    /*
    该子类继承了父类的show方法,
    又因为继承到的该方法相当于重写了接口A B中的show方法,
    所以子类中即使没有写其他方法也不会报错
    */
}

