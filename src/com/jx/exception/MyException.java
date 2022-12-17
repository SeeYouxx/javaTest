package com.jx.exception;

/**
 * @program: java
 * @description:        自定义异常
 *                                    1 编写一个类继承Exception或RuntimeException
 *                                    2 提供两个构造方法 一个无参数的 一个带有String参数的
 *
 * @author:
 * @create: 2020-10-22 10:20
 */
public class MyException extends Exception {
   public MyException(){


   }
   public MyException(String s){
       super(s);
   }
}