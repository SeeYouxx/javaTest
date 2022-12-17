package com.jx.test01;

/**
 * @program: java
 * @description:
 * @author:
 * @create: 2020-10-22 14:18
 */
public class UserService {

          public void register(String username ,String password) throws IllegalNameException {

          if (null == username || username.length()<4 || username.length()>14){

               throw  new IllegalNameException("0.0");
          }
              System.out.println("成功");
          }
}