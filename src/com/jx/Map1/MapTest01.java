package com.jx.Map1;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @program: java
 * @description:        java.util.Map接口中常用方法：
 *                               1.Map和Collection没有继承关系
 *                               2.Map集合以key和value的方式存储数据：键值对
 *                                 key和value都是引用数据类型
 *                                 key和value都是存储对象的内存地址
 *                                 key起到主导的地位 value和key的一个附属品
 *                              3.Map接口中的常用方法
 *                                 V put(K key,V value)     向Map集合中添加键值对
 *                                 V get(Object key)        通过key获取value
 *                                 int size()               获取Map集合键值对的个数
 *                                 boolean containsKey(Object key)   判断Map中是否包含某个key
 *                                 boolean containsValue(Object value)   判断Map中是否包含某个value
 *                                 V remove(Object key)      通过key删除键值对
 *                                 Set<K> keySet()           获取Map集合所有的key
 *                                 Collection<V> values()    获取Map集合中所有的value，返回一个Collection
 *                                 Set<Map.Entry<K,V>> entrySet()   将Map集合转换为Set集合
 *                                                                   Set集合中存储的数据类型是Map.Entry<K,V>
 *                                                                   Map.Entry是静态内部类
 *
 *
 * @author:
 * @create: 2020-11-04 13:40
 */
public class MapTest01 {


     public static void main(String[] args) {
        Map<Integer, String>  map = new HashMap<>();

        map.put(1, "zhangsan");
        map.put(2, "lisi");
        map.put(3, "wangwu");
        map.put(4, "zhaoliu");

        String value =map.get(2);
        System.out.println(value);

         System.out.println("键值对的数量" + map.size());

         map.remove(2);
         System.out.println("键值对的数量：" + map.size());

         System.out.println(map.containsKey(4));

         System.out.println(map.containsValue("wangwu"));
         //contains方法底层调用的都是equals进行比对的，所以自定义的类型需要重写equals方法

         Collection<String> values = map.values();
         for (String s: values){
             System.out.println(s);
         }


         map.clear();
         System.out.println(map.size());

         System.out.println(map.isEmpty());


    }


}