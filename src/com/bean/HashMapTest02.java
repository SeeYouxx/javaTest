package com.bean;

import java.util.HashSet;
import java.util.Set;

/**
 * @program: java
 * @description:           1.像Map集合中存，以及Map集合中取，都是先调用key的hashCode方法，然后在调用equals方法
 *                       equals方法又可能调用，也有可能不调用
 *                           拿put(k，v)举例，什么时候equals不会调用
 *                             k.hashCode（）方法返回哈希值
 *                             哈希值经过哈希算法转换成数组下标
 *                             数组下标位置上如果是null，equals不需要执行
 *
 *                         2.   equals和hashCode方法必须同时重写
 *                            equals方法返回true ，hashCode（）方法返回的值必须一样
 *                            equals方法返回true表示两个对象相同，在同一个单向链表上比较
 *                            那么对于同一个单向链表上的节点来说，他们的哈希值都是相同的
 *                            所以hashCode（）方法的返回值也应该相同
 *
 *
 *                         3.放在hashMap集合key部分的，以及放在HashSet集合中的元素，需要同时重写hashCode方法和equals方法
 *
 * @author:
 * @create: 2020-11-08 11:00
 */
public class HashMapTest02 {

    public static void main(String[] args) {
        Student s1  =new Student("zhangsan");
        Student s2  =new Student("zhangsan");


        //重写equals方法之前是false
        //System.out.println(s1.equals(s2));

        //重写equals方法之后是true
        System.out.println(s1.equals(s2));

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        Set<Student> students = new HashSet<>();
        students.add(s1);
        students.add(s2);
        System.out.println(students.size());

    }
}