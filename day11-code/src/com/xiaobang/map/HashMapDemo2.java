package com.xiaobang.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo2 {
    public static void main(String[] args) {
        HashMap<String, String> hs = new HashMap<String, String>();
        hs.put("xiaoming", "shanghai");
        hs.put("xiaozhang", "beijing");
        hs.put("lihua", "guangzhou");

        Set<Map.Entry<String, String>> entries = hs.entrySet();
        System.out.println(entries);

        for (Map.Entry<String, String> entry : entries) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "---" + value);

        }
    }
}
