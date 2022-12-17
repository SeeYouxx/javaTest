package com.jx.IOTest;

import com.jx.bean.Student;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 * @program: java
 * @description:         参与序列化和反序列化的对象 必须实现Serializable接口
 *
 *                             注意：通过源代码发现，Serializable接口只是一个标志接口：
 *                                      public interface Serializable {
 *
 *                                      }
 *                                      起到标识的作用 ，标志的作用，java虚拟机看到这个类型实现了接口，可能会对这个类进行特殊待遇
 *
 *                                      Serializable这个标志接口是给java虚拟机看的，会自动生成一个序列化版本号
 *
 *                       序列化版本号：
 *                               进行类的区分
 *
 *
 *                       自动序列化版本号缺陷：
 *                                 一旦代码确定之后，不能进行后续的修改
 *
 *
 *                       凡是一个类实现了serializable接口，建议给该类提供一个固定不变的序列版本号
 *
 *
 *                      transient关键字表示游离的，不参与序列化 加在变量之前
 *
 *
 * @author:
 * @create: 2020-11-22 12:49
 */
public class ObjectOutputStreamTest01 {

    public static void main(String[] args) throws  Exception {

        Student s = new Student(1111,"zhangsan");

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("students"));

        oos.writeObject(s);

        oos.flush();

        oos.close();

    }
}