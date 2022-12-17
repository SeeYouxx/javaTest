package com.jx.Map1;


import java.util.*;

/**
 * @program: java
 * @description:         List接口中常用方法
 *                          1. List集合存储元素特点：有序可重复
 *                            有序：List集合中的元素有下标
 *                            从0开始 以1递增
 *                            可重复： 存储一个1 可以在存储1
 *
 *
 *                         2.List接口的方法（特有）
 *                         void add（int index , Object element)
 *                         Object get(int index)
 *                         int indexOf(Object o)
 *                         Object remove (int index)
 *                         Object set(int index, Object element)
 *
 *
 * @author:
 * @create: 2020-11-01 10:46
 */
public class ListTest01 {
    public static void main(String[] args) {

       // List myList = new LinkedList();
        // List myList = new Vector();
        List myList = new ArrayList();

        myList.add("a");
        myList.add("b");
        myList.add("c");

        //在列表的指定位置插入指定元素（第一个参数是下标）
        //这个方法使用不多，因为对于ArrayList集合来说效率较低
        myList.add(1,"KING");

        //迭代
//        Iterator it = myList.iterator();
//        while (it.hasNext()){
//            Object obj = it.next();
//            System.out.println(obj);


//        //根据下标获取元素
//        Object fistObj = myList.get(0);
//        System.out.println(fistObj);
//        }

//        //还可以通过下标遍历  List特有方式
//        for (int i=0; i<myList.size(); i++){
//            Object obj = myList.get(i);
//            System.out.println(obj);
//        }

        //第一次出现的索引
        System.out.println(myList.indexOf("c"));

        //删除指定元素
        myList.remove(0);

        //修改指定位置元素
        myList.set(2,"sort");

        for (int i=0; i< myList.size(); i++){
            Object object =myList.get(i);
            System.out.println(object);
        }

    }
}

/**
 *   计算机英语：
 *       增删改查
 *          增： add、save、new
 *          删： delete、drop、remove
 *          改： update、set、modify
 *          查： find、get、query、select
 */
