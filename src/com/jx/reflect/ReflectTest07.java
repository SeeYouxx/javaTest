package com.jx.reflect;

import java.lang.reflect.Field;

/**
 * @program: java
 * @description:
 *                 通过反射机制访问一个java对象的属性
 *                      给属性赋值set
 *                      获取属性的值get
 * @author:
 * @create: 2020-12-01 16:23
 */
public class ReflectTest07 {
    public static void main(String[] args) throws Exception{

        //使用反射机制，访问对象的属性
        Class studentClass = Class.forName("com.jx.bean.Student01");
        Object obj = studentClass.newInstance(); //obj就是String对象（底层调用无参构造方法// ）

        //获取no属性
        Field noField = studentClass.getDeclaredField("no");

        //给obj对象（student对象）的no属性赋值

        /*
        *     虽然使用了反射机制，但是三要素还是缺一不可：
        *             要素1：obj对象
        *             要素2：no属性
        *             要素3：2222值
        * */

        noField.set(obj,2222);

        //读取属性的值
        //两个要素：获取obj对象的no属性的值
        System.out.println(noField.get(obj));

        //获取私有的属性
        Field nameField = studentClass.getDeclaredField("name");
        //打破封装(反射机制的缺点：打破封装)
        //这样私有可以访问
        nameField.setAccessible(true);
        nameField.set(obj,"jackson");
        System.out.println(nameField.get(obj));

    }
}