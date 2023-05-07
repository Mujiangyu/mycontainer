package com.niit.immutable;

import java.util.Map;
import java.util.Set;

public class ImmutableDemo3 {
    public static void main(String[] args) {

        /*
        * 键值对中的键是不能重复的
        * Map里的of方法，能传递的参数是有上限的，最多只能传递20个参数，10个键值对
        * 底层源码中的形式参数没有可变参数的of方法
        * 如果要传递多个键值对对象，可以使用ofEntries()方法，将键值对看作一个整体
        * */
        Map<String, String> map = Map.of("zhangsan", "nanjing", "lisi", "beijing", "norman", "haikou", "meimei", "hefei");

//        map.forEach((k,v)-> System.out.println(map));
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+" = "+value);
        }
    }
}
