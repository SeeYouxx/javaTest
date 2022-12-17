package com.jx.Map1;

import java.util.HashSet;
import java.util.Set;

/**
 * @program: java
 * @description:      HashSet集合：
 *                              无序不可重复
 *
 *
 *
 *                    TreeSet集合：
 *                              无序不可重复，但是存储的元素可以自动按照大小顺序排序
 *                            称为：可排序集合
 * @author:
 * @create: 2020-11-04 13:30
 */
public class HashSetTest01 {

    public static void main(String[] args) {

        Set<String> strs = new HashSet<>();

        strs.add("hello1");
        strs.add("hello2");
        strs.add("hello3");
        strs.add("hello4");
        strs.add("hello5");
        strs.add("hello6");

        for (String s : strs){
            System.out.println(s);
        }
    }


}