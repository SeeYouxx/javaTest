package com.jx.annotation;

/**
 * @program: java
 * @description:
 * @author:
 * @create: 2020-12-02 22:48
 */
public class MyAnnotationTest {

    //报错原因： 如果一个注解当中有属性，那么必须给属性赋值
   /* @MyAnnotation()
    public void doSome(){


    }*/

   //@MyAnnotation(属性名=属性值)
    //指定name的属性值
   @MyAnnotation(name="zhangsan" ,color = "red")
    public void doSome(){


   }
}