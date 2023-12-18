package com.xiaobang.recursion;

public class RecursionDemo1 {
    public static void main(String[] args) {
        // 使用递归求5的阶乘 5!
        int result = test(5);
        System.out.println(result);
    }

    public static int test(int number) {
        if (number == 1) {
            return 1;
        } else {
            return number * test(number - 1);
        }
    }
}
