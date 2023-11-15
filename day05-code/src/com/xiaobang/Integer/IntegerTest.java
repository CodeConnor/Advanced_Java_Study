package com.xiaobang.Integer;

public class IntegerTest {
    /*
        已知字符串Strings="10,50,30,20,40";
        请将该字符串转换为整数并存入数组
        随后求出最大值打印在控制台
     */
    public static void main(String[] args) {
        String str = "10,50,30,20,40";

        // 切割字符串
        String[] arrStr = str.split(",");

        // 准备容器
        int[] arrInt = new int[arrStr.length];

        for (int i = 0; i < arrStr.length; i++) {
            arrInt[i] = Integer.parseInt(arrStr[i]);
            System.out.println(arrInt[i]);
        }
        // 求最大值
        int max = arrInt[0];
        for (int i = 1; i < arrInt.length; i++) {
            if (arrInt[i] > max) {
                max = arrInt[i];
            }
        }
        System.out.println("最大值:" + max);

    }
}
