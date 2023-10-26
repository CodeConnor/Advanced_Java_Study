package com.xiaobang.myinterface;

public class InterfaceDemo3 {
    public static void main(String[] args) {

    }
}
// 定义接口
interface InterA {
    void showA();
}

interface InterB {
    void showB();
}
// 定义多继承接口
interface InterC extends InterA, InterB {
    void showC();
}

// 实现多继承接口, 需要实现所有接口的抽象方法
class CImpl implements InterC {
    @Override
    public void showA() {

    }

    @Override
    public void showB() {

    }

    @Override
    public void showC() {

    }
}