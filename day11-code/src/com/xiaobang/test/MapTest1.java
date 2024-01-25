package com.xiaobang.test;

import java.util.TreeMap;
import java.util.function.BiConsumer;


/*
    需求:字符串aababcabcdabcde
    统计字符串中每一个字符出现的次数,并按照以下格式输出输出结果:
    a(5)b(4)c(3)d(2)e(1)
 */
public class MapTest1 {
    public static void main(String[] args) {
        String s = "aababcabcdabcde";

        // 创建map集合
        TreeMap<Character, Integer> tm = new TreeMap<Character, Integer>();

        // 拆分字符串
        char[] charArray = s.toCharArray();

        // 遍历数组, 获取字符
        for (char c : charArray) {
            // 判断字符是否在集合中存在
            if (tm.containsKey(c)) {
                // 存在, 获取旧值+1 并存回集合
                tm.put(c, tm.get(c) + 1);
            } else {
                // 不存在, 字符第一次出现, 将1存回集合
                tm.put(c, 1);
            }
        }

        // 遍历集合输出结果
        tm.forEach((character, integer) -> System.out.print(character + "(" + integer + ")"));

    }
}
