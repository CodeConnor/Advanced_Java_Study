package com.xiaobang.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

public class HashMapDemo2 {
    public static void main(String[] args) {
        HashMap<String, String> hs = new HashMap<String, String>();
        hs.put("xiaoming", "shanghai");
        hs.put("xiaozhang", "beijing");
        hs.put("lihua", "guangzhou");

        hs.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String key, String value) {
                System.out.println(key + "---" + value);
            }
        });
    }

    private static void method(HashMap<String, String> hs) {
        Set<Map.Entry<String, String>> entries = hs.entrySet();
        System.out.println(entries);

        for (Map.Entry<String, String> entry : entries) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "---" + value);

        }
    }
}
