package com.xiaobang.args;

public class ArgsDemo1 {
    public static void main(String[] args) {
        System.out.println(getSum(1, 2, 3));
        System.out.println(getSum(1, 2, 3, 4));
    }


    public static int getSum(int ... args) {
        int sum = 0;
        for (int i = 0; i < args.length; i++) {
            sum += args[i];
        }
        return sum;
    }
}

