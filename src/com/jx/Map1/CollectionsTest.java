package com.jx.Map1;

import java.util.*;

/**
 * @program: java
 * @description:     java.util.Collection 集合接口
 *                   java.util.Collections 集合工具类，方便集合的操作
 *
 *                   List自定义元素集合中的元素排序，需要保证List集合中的元素实现了：Comparable接口
 * @author:
 * @create: 2020-11-14 12:01
 */
public class CollectionsTest {

    public static void main(String[] args) {
        //ArrayList集合不是线程安全的
        List<String> list = new ArrayList<>();

        //变成线程安全的
        Collections.synchronizedList(list);

        list.add("adf");
        list.add("aab");
        list.add("abs");
        list.add("adk");

        Collections.sort(list);
        for (String lisst : list){
            System.out.println(lisst);
        }

        List<WuGui1>  wuGui1s = new ArrayList<>();

        wuGui1s.add(new WuGui1(1000));
        wuGui1s.add(new WuGui1(200));
        wuGui1s.add(new WuGui1(8800));
        //List自定义元素集合中的元素排序，需要保证List集合中的元素实现了：Comparable接口
        Collections.sort(wuGui1s);
        for (WuGui1 wuGui1 : wuGui1s){
            System.out.println(wuGui1);
        }


        Set<String>  set  = new HashSet<>();
        set.add("king");
        set.add("kingsoft");
        set.add("king1");
        //将Set集合转换成List集合
        List<String>  list1 = new ArrayList<>(set);
        Collections.sort(list1);
        for (String ml : list1){
            System.out.println(ml);
        }

    }
}

class  WuGui1 implements Comparable<WuGui1>{
    int age;

    public WuGui1(int age) {
        this.age = age;
    }


    @Override
    public int compareTo(WuGui1 o) {
        return this.age - o.age ;
    }


    @Override
    public String toString() {
        return "WuGui1{" +
                "age=" + age +
                '}';
    }
}

