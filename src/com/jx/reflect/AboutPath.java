package com.jx.reflect;

import java.io.FileReader;

/**
 * @program: java
 * @description:   文件路径的问题
 * @author:
 * @create: 2020-11-30 19:00
 */
public class AboutPath {
    public static void main(String[] args) throws Exception{
        //移植性差
        //FileReader reader = new FileReader("classinfo.properties");

        //类路径：在src下的都是类路径
        //通用方式前提是：这个文件必须在类路径下
        /*
        *   解释：
        *       Thread.currentThread()   当前线程对象
        *       getContextClassLoader()  是线程对象的方法，可以获取到当前线程的类加载器对象
        *       getResource()   [获取资源] 这是类加载器对象的方法，当前线程的类加载器默认从类的根路径下加载资源
        *
        * */
        String path = Thread.currentThread().getContextClassLoader().getResource("classinfo.properties").getPath();

        //采用以上的代码可以拿到一个文件的绝对路径
        // /E:/workspace/java/out/production/java/classinfo.properties
        System.out.println(path);
    }
}