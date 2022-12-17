package com.jx.reflect;

/**
 * @program: java
 * @description:    给一个类, 获取其父类,以及实现的接口
 * @author:
 * @create: 2020-12-02 14:51
 */
public class ReflectTest13 {
    public static void main(String[] args) throws Exception{

        //String举例
        Class stringClass = Class.forName("java.lang.String");

        //获取String的父类
        Class superClas = stringClass.getSuperclass();
        System.out.println(stringClass.getName());

        //获取String类实现的所有接口(一个可以实现多个接口)
        Class[] interfaces =   stringClass.getInterfaces();
        for (Class in : interfaces){
            System.out.println(in.getName());
        }
    }
}