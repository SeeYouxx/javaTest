package com.jx.Map1;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: java
 * @description:      HashMap集合key部分允许null么
 *                             允许为空
 *                        注意：HashMap集合的key，null值只能有一个
 * @author:
 * @create: 2020-11-10 14:28
 */
public class HashMapTest03 {

    public static void main(String[] args) {
        Map map =new HashMap<>();

        map.put(null,null);
        System.out.println(map.size());

        map.put(null,100);
        System.out.println(map.get(null));
    }

}