package com.jx.test01;

/**
 * @program: java
 * @description:
 * @author:
 * @create: 2020-10-22 14:22
 */
public class IllegalNameException extends  Exception {
    public IllegalNameException(){


    }

    public IllegalNameException(String s){
        super(s);
    }
}