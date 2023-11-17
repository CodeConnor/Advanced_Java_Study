package com.xiaobang.test;

import java.util.Arrays;

public class SelectSort {
    public static void main(String[] args) {
        int[] arr = {20, 50, 40, 30, 10};

        // 选择排序
        // 外循环
        for (int i = 0; i < arr.length - 1; i++) {
            // 内循环
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
