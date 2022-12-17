package com.jx.Map1;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @program: java
 * @description:            java.util.Collection 接口中的常用方法
 *                             1.   Collection 中存放的元素
 *                                    没有使用泛型之前 ，Collection中可以存储Object的所有子类型
 *                                    只用了“泛型”之后 Collection中只能存储某个具体的类型
 *                                         只要是Object的子类型就行（集合不能直接存储基本数据类型 也不能
 *                                         java对象 只能存储java对象的内存地址）
 *
 *
 *
 *
 *                             2.Collection中的常用方法
 *                               boolean add(Object e)      像集合中添加元素
 *                               int size（） 获取集合中元素的个数
 *                               void clear（） 清空集合
 *                               boolean contains（Object o）  判断当前集合是否包含元素o   包含是true   不包含是false
 *                               boolean remove（Object o）    删除集合中的某个元素
 *                               boolean isEmpty（）     判断集合中元素的个数是否为0
 *
 *
 *
 *
 *
 *
 * @author:
 * @create: 2020-10-29 15:44
 */
public class CollectionTest01 {
    public static void main(String[] args) {

        //Collection e = new  Collection();   接口无法实例化对象

        Collection c  =new ArrayList();

        ((ArrayList) c).add("s");
        ((ArrayList) c).add("ss");
        ((ArrayList) c).add("ssssss");

        Object[] obj =c.toArray();

        for (int i= 0 ; i<obj.length ; i++){

            Object o =obj[i];
            System.out.println(o);
        }
    }




}