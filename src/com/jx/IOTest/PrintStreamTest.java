package com.jx.IOTest;

import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 * @program: java
 * @description:     java.io.PrintStream: 标准的字节输入流,默认输出到控制台
 * @author:
 * @create: 2020-11-21 15:00
 */
public class PrintStreamTest {
    public static void main(String[] args) throws  Exception {

        //联合起来写
        System.out.println("hello word");

        //分开写
        PrintStream ps = System.out;
        ps.println("hello zhangsan");
        ps.println("hello lisi");

        //标准输出流不需要手动close()关闭
        //可以改变标准输出流的方向
       /* System.gc();
        System.currentTimeMillis();
        PrintStream ps2 = System.out;
        System.exit(0);
        System.arraycopy();*/

       //标准输出流不在指向控制台,指向"log"文件
       PrintStream printStream = new PrintStream(new FileOutputStream("log"));
       //修改输出方向,将输出方向修改到"log"文件
        System.setOut(printStream);
        //在输出
        System.out.println("hello world");
        System.out.println("hello lisi");
        System.out.println("hello zhangsan");

    }

}