package com.jx.annotation;

import java.lang.annotation.Retention;

/**
 * @program: java
 * @description:
 * @author:
 * @create: 2020-12-03 13:16
 */
@MyAnnotation02()
public class MyAnnotationTest02 {

 // @MyAnnotation02(age =25 , email = {"zhangsan@123.com","zhangsan@sohu.com"},seasonArray = Season.SPRING)
    @MyAnnotation02
    public void doSome(){

    }

   // @MyAnnotation02(age = 25 , email = "zhangsan@123.com" , seasonArray = {Season.AUTUMN,Season.SPRING})
    @MyAnnotation02
    public  void  doOther(){

    }
}