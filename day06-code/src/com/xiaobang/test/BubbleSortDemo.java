package com.xiaobang.test;

import java.util.Arrays;

public class BubbleSortDemo {
    public static void main(String[] args) {
        int[] nums = {20, 50, 40, 30, 10};

        // 冒泡排序
        // 外循环: 决定循环的轮数
        for (int i = 0; i < nums.length - 1; i++) {
            // 内循环: 决定每轮外循环中元素比较的次数
            // -1: 避免索引越界
            // -i: 避免重复比较
            for (int j = 0; j < nums.length - 1 - i; j++) {
                // 交换元素
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
