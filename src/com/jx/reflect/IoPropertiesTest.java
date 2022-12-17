package com.jx.reflect;

import java.io.InputStream;
import java.util.Properties;

/**
 * @program: java
 * @description:
 * @author:
 * @create: 2020-11-30 19:14
 */
public class IoPropertiesTest {
    public static void main(String[] args) throws Exception{

       /* String path = Thread.currentThread().getContextClassLoader().getResource("classinfo.properties").getPath();

        FileReader reader = new FileReader(path);*/

        InputStream reader = Thread.currentThread().getContextClassLoader().getResourceAsStream("classinfo.properties");

        Properties pro = new Properties();
        pro.load(reader);
        reader.close();

        String className = pro.getProperty("className");
        System.out.println(className);

    }
}