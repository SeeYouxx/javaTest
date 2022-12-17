package com.jx.reflect;

import com.jx.bean.Vip;

import java.lang.reflect.Constructor;

/**
 * @program: java
 * @description:    通过反射机制调用构造方法,实例化对象
 * @author:
 * @create: 2020-12-02 14:26
 */
public class ReflectTest12 {
    public static void main(String[] args) throws  Exception{

        Vip  v1 = new Vip();
        Vip  v2 = new Vip(110,"zhangsan","2001-10-11",true);

        //使用反射机制创建对象
        Class c = Class.forName("com.jx.bean.Vip");
        //调用无参构造
        Object obj = c.newInstance();
        System.out.println(obj);
        //调用有参的构造方法
        //第一步:先获取到这个有参数的构造方法
        Constructor constructor = c.getDeclaredConstructor(int.class,String.class,String.class,boolean.class);
        //第二步:调用构造方法new对象
        Object newObj =  constructor.newInstance(110,"jackson","2001-10-11",true);
        System.out.println(newObj);

        //获取无参构造方法
        Constructor con2 = c.getDeclaredConstructor();
        Object object2 = con2.newInstance();
        System.out.println(object2);


    }
}