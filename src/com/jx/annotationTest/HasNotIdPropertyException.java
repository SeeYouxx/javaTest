package com.jx.annotationTest;

/**
 * @program: java
 * @description:
 * @author:
 * @create: 2020-12-03 23:11
 */
public class HasNotIdPropertyException extends RuntimeException{

    public  HasNotIdPropertyException(){}

    public  HasNotIdPropertyException(String s){
        super(s);
    }
}