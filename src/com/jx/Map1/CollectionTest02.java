package com.jx.Map1;

import javax.xml.crypto.dsig.spec.C14NMethodParameterSpec;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/**
 * @program: java
 * @description:                    集合遍历/迭代专题
 *
 *
 *
 *                                 删除元素之后，集合的结构发生改变，应该重新获取Iterator
 *                                                                                                                                 M
 *
 *
 * @author:
 * @create: 2020-10-31 09:44
 */
public class CollectionTest02 {

    public static void main(String[] args) {
        //  是所有Collection通用的一种方式
        //在Map集合中不能用 在所有的Collection以及子类中使用
        //创建对象

        Collection c =new ArrayList();
        c.add("abc");
        c.add("def");
        c.add(100);

        //获取集合对象的迭代器对象
        Iterator it =  c.iterator();

        //通过以上获取的迭代器对象开始迭代/遍历集合
        /*
              boolean hasNext() 如果仍有元素可以迭代，则返回true。
              Object next() 返回迭代的下一个元素
         */
        while(it.hasNext()){
            Object obj  = it.next();
            //c.remove(obj);    不能用集合的remove方法  因为迭代器无法更新

            it.remove();  //删除迭代器当前指向对象
            System.out.println(obj);
        }


        Collection c1 = new ArrayList();

        ((ArrayList) c1).add(1);
        ((ArrayList) c1).add(2);
        c1.add(4);

        Iterator it1 = c1.iterator();

        while (it1.hasNext()){
            Object obj1 =it1.next();
            System.out.println(obj1);
        }

    }

}