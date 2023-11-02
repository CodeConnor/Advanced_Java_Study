package com.xiaobang.lambda.test;

public class LambdaTest2 {
    public static void main(String[] args) {
        useStringHandle(new StringHandle() {
            @Override
            public void printMessage(String msg) {
                System.out.println("匿名内部类消息:" + msg);
            }
        });

        System.out.println("-------------------");

        useStringHandle(msg -> System.out.println("Lambda表达式消息:" + msg));

    }

    public static void useStringHandle(StringHandle stringHandle) {
        stringHandle.printMessage("xiaobang");
    }
}

interface StringHandle {
    void printMessage(String msg);
}
