package com.xiaobang.recursion;

/*
    使用递归求1~n的和
 */

public class RecursionDemo2 {
    public static void main(String[] args) {
        int result = test(3);
        System.out.println(result);

    }



    public static int test(int num) {
        if (num == 1) {
            return 1;
        } else {
            return num + test(num - 1);
        }
    }
}


