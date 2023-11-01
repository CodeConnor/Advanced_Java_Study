package com.xiaobang.inner;

public class AnonClassTest {
    public static void main(String[] args) {
        // 方法1
        useInter(new InterImpl());

        // 方法2, 在调用的方法中定义匿名内部类来实现接口
        useInter(new Inter() {
            @Override
            public void show() {
                System.out.println("匿名内部类...show...");
            }
        });
    }


    /*
     为了将对象传入形参,有两个方法
         1. 定义接口实现类, 传入实现类对象
         2. 定义匿名内部类, 直接在所调用的方法中实现接口
     */
    public static void useInter(Inter i) {
        i.show();
    }
}


interface Inter {
    void show();
}


class InterImpl implements Inter {

    @Override
    public void show() {
        System.out.println("InterImpl...show...");
    }
}
