package com.xiaobang.tools;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsDemo1 {
    public static void main(String[] args) {
        // 批量添加
        ArrayList<String> list = new ArrayList<String>();
        Collections.addAll(list, "a", "b", "c", "d");
        System.out.println(list);

        // 二分查找
        int index = Collections.binarySearch(list, "a");
        System.out.println(index);

        // 元素洗牌
        Collections.shuffle(list);
        System.out.println(list);

        // 获取最值
        ArrayList<Integer> nums = new ArrayList<Integer>();
        Collections.addAll(nums, 1, 2, 3, 4, 5, 6, 7);
        System.out.println(Collections.min(nums));
        System.out.println(Collections.max(nums));

        // 交换元素
        Collections.swap(nums, 1, 5);
        System.out.println(nums);

        // 排序
        System.out.println("--------------------");
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        Collections.addAll(numbers, 1, 3, 2, 6, 4, 5);
        System.out.println(numbers);
        Collections.sort(numbers);
        System.out.println(numbers);

    }
}
