package com.niit.immutable;

import java.util.List;

public class ImmutableDemo1 {
    public static void main(String[] args) {
        /*
         * 创建不可变的list集合*/
        //一旦创建完毕，无法进行修改，只能进行查询操作
        List<String> list = List.of("zhangsan", "lisi", "wangwu");
        list.forEach(s -> System.out.println(list));

//        list.remove("lisi");
//        list.add("norman");
//        list.set(0,"aaa");
    }

}
