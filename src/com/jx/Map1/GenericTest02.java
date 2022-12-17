package com.jx.Map1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @program: java
 * @description:          自动类型推断机制：
 *                                  钻石表达式
 *
 *
 *                                  E: element
 *                                  T: Type
 *
  * @author:
 * @create: 2020-11-03 22:18
 */
public class GenericTest02 {

    public static void main(String[] args) {

        List<Animal> myList = new ArrayList<>();

        myList.add(new Animal());
        myList.add(new Cat());
        myList.add(new Bird());

//        Iterator<Animal> it  =myList.iterator();
//        while(it.hasNext()){
//            Animal a =it.next();
//            a.move();
//        }

        for(Animal i : myList){
            System.out.println(i);
        }

    }
}