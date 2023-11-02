package com.xiaobang.adapter;

public class AdapterDemo1 {
    public static void main(String[] args) {
        TargetClass tc = new TargetClass();
        tc.targetMethod();
    }
}

interface Inter66 {
    void method1();
    void method2();
    void method3();
    void targetMethod();
}

// 定义适配器
abstract class Inter66Adapter implements Inter66 {

    @Override
    public void method1() {

    }

    @Override
    public void method2() {

    }

    @Override
    public void method3() {

    }

    @Override
    public void targetMethod() {

    }
}

// 定义适配器子类 重写目标方法
class TargetClass extends Inter66Adapter {
    @Override
    public void targetMethod() {
        System.out.println("通过适配器实现的目标方法.....");
    }
}