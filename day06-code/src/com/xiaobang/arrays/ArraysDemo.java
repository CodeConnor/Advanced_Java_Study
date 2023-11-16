package com.xiaobang.arrays;

import java.util.Arrays;

public class ArraysDemo {
    /*
        public static String toString (类型[] a):将数组元素拼接为带有格式的字符串
        public static boolean equals (类型[] a,类型[] b):比较两个数组内容是否相同
        public static int binarySearch (int[] a, int key): 查找元素在数组中的索引(二分查找法:保证数组的元素是排好序的)
        public static void sort (类型[] a):对数组进行默认升序排序
     */
    public static void main(String[] args) {
        int[] arr1 = {10, 20, 30, 40, 50};
        int[] arr2 = {10, 20, 30, 40, 50};

        // 输出为字符串
        System.out.println(Arrays.toString(arr1));
        // 两数组比较
        System.out.println(Arrays.equals(arr1, arr2));

        // 查找元素
        System.out.println(Arrays.binarySearch(arr1, 30));
        // 所查找元素不存在
        System.out.println(Arrays.binarySearch(arr1, 31));

        // 数组没排好序, 查找结果有误
        int[] nums = {20, 10, 40, 50, 30};
        System.out.println(Arrays.binarySearch(nums, 10));

        System.out.println(Arrays.toString(nums));
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));


    }
}
