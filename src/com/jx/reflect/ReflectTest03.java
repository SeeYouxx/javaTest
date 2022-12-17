package com.jx.reflect;

import java.io.FileReader;
import java.util.Properties;

/**
 * @program: java
 * @description:    验证反射机制的灵活性
 *                       java代码写一遍，在不改变java源代码的基础上，可以做到不同对象的变化
 *                       非常之灵活(符合OCP开闭原则：对扩展开放，对修改关闭)
 *
 * @author:
 * @create: 2020-11-30 18:21
 */
public class ReflectTest03 {
    public static void main(String[] args) throws  Exception {
        //通过IO流读取classinfo.properties文件
        FileReader reader = new FileReader("classinfo.properties");
        //创建属性类对象Map
        Properties pro = new Properties();
        //加载
        pro.load(reader);
        //关闭流
        reader.close();

        //通过key获取value
        String className = pro.getProperty("className");
        //System.out.println(className);

        //通过反射机制实例化对象
        Class c = Class.forName(className);
        Object obj = c.newInstance();
        System.out.println(obj);

    }
}