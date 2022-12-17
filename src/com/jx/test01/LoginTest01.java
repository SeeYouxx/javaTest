package com.jx.test01;



/**
 * @program: java
 * @description:
 * @author:
 * @create: 2020-10-22 14:44
 */
public class LoginTest01 {
    public static void main(String[] args) {
            UserService userService = new UserService();


        try {
            userService.register(null, "123");
        } catch (IllegalNameException e) {
           // System.out.println(e.getMessage());
            e.printStackTrace();
        }



    }
    }