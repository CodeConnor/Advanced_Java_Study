package com.xiaobang.recursion;


/*
    猴子第一天摘下若千个桃子当即吃了一半,还不过瘾,又多吃了一个
    第二天早上又将剩下的桃子吃掉一半,又多吃了一个
    以后每天早上都吃了前一天剩的一半零一个
    到第10天早上想再吃时,见只剩下一个桃子了
    求第一天共摘了多少桃子?

    1  4  10  22  ... (f(n-1) + 1) * 2
 */
public class RecursionDemo4 {
    public static void main(String[] args) {
        int sum = getSum(10);
        System.out.println(sum);
    }

    public static int getSum(int num) {
        if (num == 1) {
            return 1;
        } else {
            return (getSum(num - 1) + 1) * 2;
        }
    }
}
