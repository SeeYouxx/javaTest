package com.jx.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @program: java
 * @description:
 * @author:
 * @create: 2020-12-03 13:14
 */
@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation02 {
/*

    */
/*
      年龄属性
     *//*

    int age();

    */
/*
    邮箱地址属性，支持多个
     *//*

    String[] email();


    Season[] seasonArray();
*/

   String value() default "吉林";

}