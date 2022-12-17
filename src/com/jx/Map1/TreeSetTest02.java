package com.jx.Map1;

import java.awt.image.VolatileImage;
import java.util.TreeSet;

/**
 * @program: java
 * @description:
 * @author:
 * @create: 2020-11-12 15:11
 */
public class TreeSetTest02 {


    public static void main(String[] args) {
        TreeSet<Vip> vips = new TreeSet<>();
        vips.add(new Vip("zhangsi",20));
        vips.add(new Vip("zhangli",20));
        vips.add(new Vip("king",18));
        vips.add(new Vip("soft",17));

        for (Vip vip : vips){
            System.out.println(vip);
        }
    }
}

class Vip  implements Comparable<Vip>{

    String name;
    int age;

    public Vip(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Vip{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    /*
       CompareTo方法的返回值很重要
           返回表示相同，value会覆盖
           返回>0, 会继续在右子树上找， 【10-9 = 1，1> 0的说明左边这个数字比较大，所以右子树上找】
           返回＜0，会继续在左子树上找


    */
    @Override
    public int compareTo(Vip v){
        if (this.age == v.age) {

            return this.name.compareTo(v.name);
        }else {
            return  this.age - v.age;
        }
    }
}