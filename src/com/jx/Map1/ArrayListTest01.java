package com.jx.Map1;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: java
 * @description:
*                             ArrayList集合的扩容：
 *                               增长到原容量的1.5倍
 *
 *
 *                            ArrayList集合底层是数组，怎么优化
 *                                尽可能少的扩容。因为数组扩容效率比较低，建议在使用ArrayList集合
 *                                的时候预估计元素的个数，给定一个初始化容量
 *
 *
 *                             检索效率比较高
 *
 *                             随机增删元素效率比较低
 *
 *                             另外数组无法存储大数据量 （很难找到一块非常巨大的连续的内存空间）
 *
 *                             像数组末尾添加元素 效率很高 不受影响
 *
 *                             ArrayList集合
 *                                 因为往数组末尾添加元素 效率不受影响
 *                                 检索/查找某个元素操作多
 *
 * @author:
 * @create: 2020-11-01 15:16
 */
public class ArrayListTest01 {

    public static void main(String[] args) {

        //默认初始化容量是10（底层先创建了一个长度为0的数组，当添加一个元素的时候，初始化为10）
        List list1 = new ArrayList();
        //集合的size（）方法是获取当前集合中元素的个数，不是获取集合的容量
        System.out.println(list1.size());

        //指定初始化容量
        List list01 = new ArrayList(20);
        //集合的size（）方法是获取当前集合中元素的个数。不是获取集合的容量
        System.out.println(list01.size());

        


    }
}