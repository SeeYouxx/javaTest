package com.jx.Map1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @program: java
 * @description:      泛型：
 *                      泛型这种机制 只在程序编译阶段起作用 只是给编译器参考的 运行阶段泛型没用
 *
 *                      好处：
 *                        集合中存储的元素类型统一了
 *                        从集合中取出的元素类型是泛型指定的类型，不需要进行大量的“向下转型”
 *
 *                      缺点：
 *                        导致集合中存储的元素缺乏多样性
 *                        大多数业务中 集合中元素的类型还是统一的 所以这种泛型特性被认可
 * @author:
 * @create: 2020-11-03 10:38
 */
public class GenericTest01 {

    public static void main(String[] args) {
       /* List  mylist = new ArrayList();

        Cat c =new Cat();

        Bird b =new Bird();

        mylist.add(c);
        mylist.add(b);

        Iterator it =mylist.iterator();

        while (it.hasNext()){
            Object o = it.next();
            if (o instanceof Cat){
                Cat cat = (Cat) o;
                cat.catchMouse();

            }
        }*/


       //使用泛型List<Animal>之后 表示List集合中只允许存储Animal类型的数据
       //用泛型来指定集合中存储的数据类型
       List<Animal> myList = new ArrayList<>();

        //指定List集合中只能存储Animal，那么存储String就编译报错了。
        // 这样用了泛型之后 集合元素的数据类型更加统一了
        //myList.add（"abc"）;

        Cat c =new Cat();
        Bird b =new Bird();

        myList.add(c);
        myList.add(b);
        myList.add(b);

        Iterator<Animal> it = myList.iterator();
        while (it.hasNext()){
            Animal a =it.next();
            a.move();

            //调用子类型特有的方法还是需要向下转型的

        }

    }

}


class  Animal {

    public void move(){
        System.out.println("yidong");
    }

}

class Cat extends Animal {

    public void catchMouse(){
        System.out.println("mao");
    }
}

class Bird extends  Animal{

    public void fly(){

        System.out.println("fei");
    }
}