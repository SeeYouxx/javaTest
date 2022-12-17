package com.jx.Map1;

import com.sun.org.apache.xml.internal.security.Init;

import java.lang.reflect.MalformedParameterizedTypeException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @program: java
 * @description:
 * @author:
 * @create: 2020-11-09 09:21
 */
public class MapTest02 {

    public static void main(String[] args) {

        //第一种方式，获取所有的key 来遍历value
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "zhangsan");
        map.put(2, "lisi");
        map.put(3, "wangwu");
        map.put(4, "zhaoliu");

        //遍历Map集合
        Set<Integer> keys = map.keySet();
        //遍历key 通过key获取value
        //迭代器可以
    /*    Iterator<Integer>  it  = keys.iterator();
        while(it.hasNext()){
            Integer key=it.next();
            String value = map.get(key);
            System.out.println(value);

        }
*/
/*
        for (Integer u :keys){
            System.out.println(u);
        }*/

        Set<Map.Entry<Integer, String>> set = map.entrySet();

        Iterator<Map.Entry<Integer, String>> iterator = set.iterator();
        while(iterator.hasNext()){
            Map.Entry<Integer,String> node =iterator.next();
            Integer key =node.getKey();
            String value=node.getValue();
            System.out.println(key + "=" +value);
        }


        //适合大数据量
        for (Map.Entry<Integer, String> maps : set) {
            System.out.println(maps);

        }
    }
}