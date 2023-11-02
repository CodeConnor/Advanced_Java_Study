package com.xiaobang.lambda.test;

import java.util.Random;

public class LambdaTest3 {
    public static void main(String[] args) {
        useRandomNumHandle(new RandomNumHandle() {
            @Override
            public int getNumber() {
                return new Random().nextInt(100) + 1;
            }
        });

        System.out.println("-----------------");
        useRandomNumHandle(() -> new Random().nextInt(100) + 1);

    }

    public static void useRandomNumHandle(RandomNumHandle randomNumHandle) {
        int result = randomNumHandle.getNumber();
        System.out.println(result);
    }
}


interface RandomNumHandle {
    int getNumber();
}