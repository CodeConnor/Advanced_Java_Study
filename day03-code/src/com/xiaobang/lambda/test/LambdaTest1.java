package com.xiaobang.lambda.test;

public class LambdaTest1 {
    public static void main(String[] args) {
        useShowHandle(new ShowHandle() {
            @Override
            public void show() {
                System.out.println("匿名表达式...show...");
            }
        });

        // Lambda表达式的省略写法
        useShowHandle(() -> System.out.println("Lambda省略写法...show..."));
    }

    public static void useShowHandle(ShowHandle showHandle) {
        showHandle.show();
    }
}

interface ShowHandle {
    void show();
}
