package com.jx.exception;

/**
 * @program: java
 * @description:            final  finally finalize区别
 *
 * @author:
 * @create: 2020-10-20 10:57
 */
public class Finally {
    public static void main(String[] args) {

        //final 是一个关键字 表示最终的 不变的
        final  int i=100;

        //  finally 也是一个关键字  和try联合使用 使用在异常处理机制中
        try{

        }finally {
            System.out.println("finally");
        }

        //finalize()是Object类中的一个方法。作为方法名出现
        //所以finalize是标识符
        Object obj;


    }
}