package com.xiaobang.args;

public class ArgsDemo1 {
    public static void main(String[] args) {
        getSum(1, 2, 3);
        getSum(1, 2, 3, 4);
    }


    public static int getSum(int ... args) {
        System.out.println(args);
        return 0;
    }
}

