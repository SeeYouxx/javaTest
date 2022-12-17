package com.jx.array;

/**
 * @program: java
 * @description:
 * @author:
 * @create: 2020-10-09 10:56
 */
public class ArrayListTest03 {


     /*
      *   String[] args
      *  为了给用户输入用的   可在 Run   Edit Configurations    Program Arguments
      *              输入参数并测试。
      */

    public static void main(String[] args) {
           if (args.length != 2){
               System.out.println("使用时请输入用户名和密码");
               return;
           }

           String username = args [0];
           String password = args [1];

           if ("admin".equals(username) && "admin".equals(password)){
               System.out.println("登陆成功");
           }else{
               System.out.println("登陆失败");
           }

    }
}