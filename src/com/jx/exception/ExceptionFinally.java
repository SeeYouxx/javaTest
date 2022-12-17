package com.jx.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @program: java
 * @description:         在finally子句中的代码是最后执行的 并且一定会执行的 即使try语句块中的代码出现了异常
 *                       finally子句必须和try一起出现 不能单独编写
 *
 *                       放在finally语句块中的语句一定会被执行
 *                       return总是在最后执行
 *                       System.exit(0);//退出java虚拟机  finally语句块不执行
 *
 *
 *
 *                       java语法规则：
 *                            方法体中必须遵循自上而下顺序依次逐行执行
 *                            return语句一旦被执行 整个方法不惜结束
 *
 *
 *
 *                           java    DJ  Decompilerc  反编译软件
 *
 *                  public  static   void  main （String args[]）{
 *                          int  result = m（）；
 *                          System.out.println(result); //100
 *                  }
 *                  public static  int m(){
 *                      int i =100 ;
 *
 *                      try{
 *                          return i;
 *                      }finally{
 *                          i++;
 *                      }
 *
 *                  }
 *
 *
 * @author:
 * @create: 2020-10-19 23:11
 */
public class ExceptionFinally {

    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("C:\\Intel");

            String s = null;

            s.toString();
            System.out.println("hello world");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NullPointerException e) {
            e.printStackTrace();
        } finally {
            System.out.println("hello");
            if (fis != null) { //避免空指针异常
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println("hello kitty");
    }

}

