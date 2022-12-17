package com.jx.IOTest;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 * @program: java
 * @description:
 * @author:
 * @create: 2020-11-22 13:31
 */
public class ObjectInputStreamTest {

    public static void main(String[] args) throws  Exception {

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("students"));
        //开始反序列化
        Object o = ois.readObject();
        //反序列化回来是一个学生对象，所以会调用学生对象的toString方法
        System.out.println(o);
        ois.close();
    }
}