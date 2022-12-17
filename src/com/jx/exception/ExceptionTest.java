package com.jx.exception;

/**
 * @program: java
 * @description:         获取异常简单的描述信息
 *                            String msg = exception.getMessage（）
 *
 *                       打印异常追踪的堆栈信息
 *                             exception.printStackTrace()
 *
 *
 * @author:
 * @create: 2020-10-19 22:49
 */
public class ExceptionTest {
    public static void main(String[] args) {


        NullPointerException  e = new NullPointerException("空指针异常");

        //实际是构造方法上面的String参数
        String msg = e.getMessage();
        System.out.println(msg);

        //打印异常堆栈信息
        //java后台打印异常堆栈信息时候 是采用了异步线程的方式打印
        e.printStackTrace();
    }

}