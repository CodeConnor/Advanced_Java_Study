package com.xiaobang.test;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        int index = binarySearch(arr, 70);
        int index1 = binarySearch(arr, 66);

        System.out.println(index);
        System.out.println(index1);
    }

    private static int binarySearch(int[] arr, int num) {
        int min = 0;
        int max = arr.length - 1;
        int mid;  // 先不计算中间索引

        while(min <= max){
            // 只有当满足循环条件时, 才计算中间索引
            mid = (min + max)/ 2;
            // 对比
            if (arr[mid] > num) {
                max = mid - 1;
            } else if (arr[mid] < num) {
                min = mid + 1;
            } else {
                return mid;
            }
        }
        // 没找到
        return -1;
    }
}
