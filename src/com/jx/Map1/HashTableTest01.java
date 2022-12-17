package com.jx.Map1;

import java.util.Hashtable;
import java.util.Map;

/**
 * @program: java
 * @description:    HashTable的key和value都是不能为null的
 *                  HashMap集合的key和value都是可以为null的
 *
 *
 *                  HashTable方法都带有synchronized：线程安全的
 *                  线程安全有其他的方案，这个Hashtable对线程的处理导致效率比较低，使用较少
 *
 *                  Hashtable和HashMap一样，底层都是哈希表数据结构
 *                  初始化容量是11    集合扩容是：原容量*2+1
 *
 * @author:
 * @create: 2020-11-10 15:02
 */
public class HashTableTest01 {
    public static void main(String[] args) {

        Map map = new Hashtable();

        map.put(null,null);
        System.out.println(map.size());
    }
}