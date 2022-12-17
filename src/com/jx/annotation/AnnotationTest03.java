package com.jx.annotation;

/**
 * @program: java
 * @description:   表示这个类已过时
 * @author:
 * @create: 2020-12-02 22:34
 */
@Deprecated
public class AnnotationTest03 {

    public static void main(String[] args) {
          AnnotationTest03 at =new AnnotationTest03();
          at.doSome();
    }

    @Deprecated
    public void doSome(){
        System.out.println("do something!");
    }

    @Deprecated
    public static void  doOther(){
        System.out.println("do other!");
    }
}

class  T{
    public static void main(String[] args) {
        AnnotationTest03 at1 = new AnnotationTest03();
        at1.doSome();

        AnnotationTest03.doOther();
    }
}