package com.jx.Map1;

import java.util.Properties;

/**
 * @program: java
 * @description:            Properties是一个Map集合，继承Hashtable，Properties的key和value都是String类型
 *                          Properties被称为属性类对象
 *                          Properties是线程安全的
 * @author:
 * @create: 2020-11-11 10:20
 */
public class PropertiesTest01 {
    public static void main(String[] args) {

        Properties pro = new Properties();

        //Properties的两个方法 存 取
        pro.setProperty("url","aa");
        pro.setProperty("driver","sd");
        pro.setProperty("username","ad");
        pro.setProperty("password","asda");

        //通过key获取value
        String  url  = pro.getProperty("url");
        String  driver = pro.getProperty("driver");
        String  username= pro.getProperty("username");
        String  password= pro.getProperty("password");

        System.out.println(url);
        System.out.println(driver);
        System.out.println(username);
        System.out.println(password);

    }
}