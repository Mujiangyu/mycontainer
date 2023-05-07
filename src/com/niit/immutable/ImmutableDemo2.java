package com.niit.immutable;

import java.util.Set;

public class ImmutableDemo2 {
    public static void main(String[] args) {

        //细节:
//       当我们要获取一个不可变得的set集合时，一定要保证集合中元素的唯一性，否则会报错

        Set<String> set = Set.of("norman","meimei","qianqian","norman");
        set.forEach(s -> System.out.println(s));

//        set.remove("meimei");
//        set.add("xiaozheng");
    }
}
