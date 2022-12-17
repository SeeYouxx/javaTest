package com.jx.Map1;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @program: java
 * @description:       自平衡二叉树： 遵循左小右大原则存放
 *                     遍历二叉树的时候有三种方式：
 *                           前序遍历：根左右
 *                           中序遍历：左根右
 *                           后序遍历：左右根
 *
 *                           注：前中后说的是“根”的位置，
 *                               根在前面是前序，根在中间
 *                               是中序，跟在后面是后序
 *
 *
 *                     TreeSet集合/TreeMap集合采用的是：中序遍历方式
 *                          Iterator迭代器采用的是中序遍历方式（左根右）
 *
 *
 *                     Comparator 和 Comparable
 *                        当比较规则不会发生改变的时候，或者说当比较规则只有1的时候，建议实现Comparable接口
 *                        如果比较规则有多个，并且需要多个比较规则之间频繁切换，建议使用Comparator接口
 *
 *                        Comparator接口是OCP原则
 *
 * @author:
 * @create: 2020-11-13 10:46
 */
public class BinaryTreeTest01 {


    public static void main(String[] args) {
        //TreeSet<WuGui> wuGuis = new TreeSet<>(new WuGuiComparator());

        //可以用匿名内部类
        TreeSet<WuGui> wuGuis = new TreeSet<>(new Comparator<WuGui>() {
            @Override
            public int compare(WuGui o1, WuGui o2) {
                return  o1.age - o2.age;
            }
        });

        wuGuis.add(new WuGui(1000));
        wuGuis.add(new WuGui(200));
        wuGuis.add(new WuGui(600));

        for (WuGui wuGuis1 : wuGuis){
            System.out.println(wuGuis1);
        }
    }

}


class WuGui {

    int age;

    public WuGui(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "小乌龟{" +
                "age=" + age +
                '}';
    }
}

//单独在这里编写一个比较器
//比较器实现java.util.Comparator接口 （Comparable是java.lang包下的）
/*
class  WuGuiComparator implements Comparator<WuGui> {


    @Override
    public int compare(WuGui o1, WuGui o2) {
        return o1.age - o2.age;
    }
    }
*/
