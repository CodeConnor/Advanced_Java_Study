package com.xiaobang.recursion;

/*
    裴波那契数列
    有一对兔子,从出生后第3个月起每个月都生一对兔子,
    小兔子长到第三个月后每个月又生一对兔子,
    假如兔子都不死,问第二十个月的兔子 <对数> 为多少?

    1 1 2 3 5 8
 */

public class RecursionDemo3 {
    public static void main(String[] args) {
        int result = rabbitCount(20);
        System.out.println(result);
    }

    public static int rabbitCount(int month) {
        if (month == 1 || month == 2) {
            return 1;
        } else {
            return rabbitCount(month - 1) + rabbitCount(month - 2);
        }
    }
}
