package com.xiaobang.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.function.BiConsumer;

/*
定义一个Map集合,键用表示省份名称,值表示市,但是市会有多个.
添加完毕后,遍历结果:
格式如下:
江苏省=南京市, 扬州市, 苏州市, 无锡市, 常州市
湖北省=武汉市, 孝感市, 十堰市, 宜昌市, 鄂州市
四川省=成都市, 绵阳市, 自贡市, 攀枝花市, 泸州市
 */
public class MapTest2 {
    public static void main(String[] args) {
        HashMap<String, List<String>> hm = new HashMap<String, List<String>>();
        ArrayList<String> list1 = new ArrayList<>();
        Collections.addAll(list1, "南京市", "扬州市", "苏州市", "无锡市", "常州市");
        ArrayList<String> list2 = new ArrayList<>();
        Collections.addAll(list2, "武汉市", "孝感市", "十堰市", "宜昌市", "鄂州市");
        ArrayList<String> list3 = new ArrayList<>();
        Collections.addAll(list3, "成都市", "绵阳市", "自贡市", "攀枝花市", "泸州市");

        hm.put("江苏省", list1);
        hm.put("湖北省", list2);
        hm.put("四川省", list3);

        hm.forEach(new BiConsumer<String, List<String>>() {
            @Override
            public void accept(String key, List<String> values) {
                System.out.print(key + "=");
                for (int i = 0; i < values.size() - 1; i++) {
                    System.out.print(values.get(i) + ", ");
                }
                System.out.println(values.get(values.size() - 1));
            }
        });
    }
}
