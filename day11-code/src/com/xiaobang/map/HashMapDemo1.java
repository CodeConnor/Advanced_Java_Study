package com.xiaobang.map;

import java.util.HashMap;
import java.util.Set;

public class HashMapDemo1 {
    public static void main(String[] args) {
        HashMap<String, String> hs = new HashMap<String, String>();
        hs.put("xiaoming", "shanghai");
        hs.put("xiaozhang", "beijing");
        hs.put("lihua", "guangzhou");

        System.out.println(hs);

        Set<String> keys = hs.keySet();
        for (String key : keys) {
            String value = hs.get(key);
            System.out.println(key + "===" + value);
        }
    }
}
