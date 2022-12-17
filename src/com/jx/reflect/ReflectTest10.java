package com.jx.reflect;

import com.jx.service.UserService;

import java.lang.reflect.Method;

/**
 * @program: java
 * @description:  通过反射机制调用一个对象的方法
 * @author:
 * @create: 2020-12-02 13:52
 */
public class ReflectTest10 {
    public static void main(String[] args) throws Exception {

        UserService us =  new UserService();
        boolean ret =us.login("admin","123");
        System.out.println(ret);

        Class  userServiceClass = Class.forName("com.jx.service.UserService");
        //创建对象
        Object obj = userServiceClass.newInstance();
        //获取Method
        Method loginMethod = userServiceClass.getDeclaredMethod("login", String.class, String.class);
        //调用方法
        //  四要素:  对象  方法名  实参列表  返回值

        /*
        *
        *  loginMethod方法
        *  obj对象
        *  "admin" ,"123"实参
        *  retValue 返回值
        *
        */
        Object retValue = loginMethod.invoke(obj,"admin","123");
        System.out.println(retValue);

    }
}