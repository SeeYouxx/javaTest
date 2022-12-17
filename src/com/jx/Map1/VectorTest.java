package com.jx.Map1;

import jdk.nashorn.internal.ir.LiteralNode;

import java.awt.*;

import java.util.*;
import java.util.List;

/**
 * @program: java
 * @description:       底层是数组
 *                     初始化容量：10
 *
 *                     扩容之后是原容量的2倍
 *
 *                     ArrayList集合扩容是原容量的1.5倍
 *
 *                    Vector中所有方法都是线程同步的，都带synchronized关键字
 *                  是线程安全的 效率比较低 使用较少
 *
 *                    将线程不安全的ArrayList集合转换成线程安全的呢
 *                       java.util.Collections;
 *
 *                       java.util.Collection  是集合接口。
 *                       java.util.Collections 是集合工具类。
 * @author:
 * @create: 2020-11-02 15:54
 */
public class VectorTest {

    public static void main(String[] args) {

        List vector =new Vector();

        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(14);
        vector.add(15);
        vector.add(5);
        vector.add(6);


        Iterator iterator= vector.iterator();

        while (iterator.hasNext()){
            Object o=   iterator.next();
            System.out.println(o);
        }


        List myList = new ArrayList();
        //将ArrayList转换为线程安全的
        Collections.synchronizedList(myList);

        myList.add("111");
        myList.add("22");
        myList.add("w22");





    }

}