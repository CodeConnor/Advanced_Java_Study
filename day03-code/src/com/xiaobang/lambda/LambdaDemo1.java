package com.xiaobang.lambda;

public class LambdaDemo1 {
    public static void main(String[] args) {
        // 匿名内部类
        useInterA(new InterA() {
            @Override
            public void show() {
                System.out.println("被匿名内部类重写的show方法...");
            }
        });

        System.out.println("--------------------------------------");

        useInterA(() -> {
            System.out.println("被Lambda表达式重写的show方法...");
        });
    }

    public static void useInterA(InterA a) {
        a.show();
    }
}

interface InterA {
    void show() ;
}
