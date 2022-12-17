package com.jx.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @program: java
 * @description:
 * @author:
 * @create: 2020-10-19 23:01
 */
public class ExceptionTest1 {

    public static void main(String[] args) {
        try {
            m1();
        } catch (FileNotFoundException e) {
             //二选一
             String msg =e.getMessage();
             System.out.println(msg);

            //打印异常堆栈信息
            e.printStackTrace();
        }
        //程序很健壮   《服务器不宕机》
        System.out.println("");
    }
    private  static void m1() throws FileNotFoundException {
        m2();
    }
    private  static  void m2() throws FileNotFoundException {
        m3();
    }
    private  static  void  m3() throws FileNotFoundException {
        new FileInputStream("D:\\360极速浏览器下载");
    }
}