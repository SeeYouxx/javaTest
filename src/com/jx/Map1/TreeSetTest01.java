package com.jx.Map1;

import java.util.TreeSet;

/**
 * @program: java
 * @description:            TreeSet集合底层实际上是一个TreeMap
 *                          TreeMap集合底层是一个二叉树
 *                          放到TreeSet集合中的元素 等同于放到TreeMap集合的key部分了
 *                          TreeSet集合中的元素：无序不可重复，但是可以按照元素的大小顺序自动排序（可排序集合）
 *
 * @author:
 * @create: 2020-11-11 15:55
 */
public class TreeSetTest01 {

    public static void main(String[] args) {

        TreeSet<String> treeSet = new TreeSet<>();

        treeSet.add("zhangsan");
        treeSet.add("lisi");
        treeSet.add("wangwu");
        treeSet.add("zhangli");
        treeSet.add("wangliu");

        for (String s : treeSet){
            System.out.println(s);
        }



        //对于自定义类型，TreeSet无法排序
        Person P1 = new Person(32);
        Person P2 = new Person(20);
        Person P3 = new Person(30);
        Person P4 = new Person(25);

        TreeSet<Person> persons = new TreeSet<>();
        persons.add(P1);
        persons.add(P2);
        persons.add(P3);
        persons.add(P4);

        for (Person person: persons){
            System.out.println(person);
        }

    }

}
//自定义类型要实现Comparable接口
class Person implements Comparable<Person>{
    int age;

    public Person(int age){
        this.age =age;
    }

    @Override
    public String toString() {
        return "Person[age ="+age+"]";
    }


    //需要在这个方法中编写比较的逻辑 或者说比较的规则
    //k.compareTo(t.key)
    //拿着参数k和集合中的每一个k进行比较，返回值可能是>0, <0, =0
    //比较规则最终还是由程序员指定的，
    public int compareTo(Person p){//c1.compareTo(c2)
        //this是c1
        //p是c2
        //c1和c2比较的时候，就是this和c比较
     /* int age1 = this.age;
      int age2 = p.age;
      if (age1 == age2){
          return 0;
      }else if (age1 > age2){
          return  1;
      }else {
          return -1;
      }*/
       // return this.age - p.age;
        return  p.age - this.age;

    }
}