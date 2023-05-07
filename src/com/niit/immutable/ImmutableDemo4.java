package com.niit.immutable;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ImmutableDemo4 {
    public static void main(String[] args) {
        /*
        * 创建键值对集合，键值对的数量超过十个
        * */
        HashMap<String,String> hm = new HashMap<>();
        hm.put("a","1");
        hm.put("b","2");
        hm.put("c","3");
        hm.put("d","4");
        hm.put("e","5");
        hm.put("f","6");
        hm.put("g","7");
        hm.put("h","8");
        hm.put("i","9");
        hm.put("j","10");

        /*Set<Map.Entry<String, String>> entries = hm.entrySet();
        //把entries对象变成一个数组
        Map.Entry[] arr = new Map.Entry[0];
        //toArrary方法在底层会比较集合与数组的长度大小
        //如果集合的长度 > 数组的长度:数据在数组中放不下，此时会根据实际数据的个数，重新创建数组
        //如果集合的长度 < 数组的长度: 数据在数组中放的下，此时不会重新创建数组，直接将数据存入数组中
        Map.Entry[] arr2 = entries.toArray(arr);
        //不可变集合Map
        Map map = Map.ofEntries(arr2);
        System.out.println(map);*/

        Map<Object, Object> map = Map.ofEntries(hm.entrySet().toArray(new Map.Entry[0]));
        System.out.println(map);


     /*   Map<String, String> map = Map.copyOf(hm);
        System.out.println(map);*/



    }
}
