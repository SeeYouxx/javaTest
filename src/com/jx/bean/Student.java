package com.jx.bean;

import java.io.Serializable;

/**
 * @program: java
 * @description:
 * @author:
 * @create: 2020-11-22 13:01
 */
public class Student implements Serializable {
    private static final long serialVersionUID = 958607578900249456L;

    //public static final long serialVersionUID = 1L;  //java虚拟机识别一个类的时候先通过类名，如果类名一致，则会识别序列版本号

    private  int no;
    private  String name;


    public Student() {
    }

    public Student(int no, String name) {
        this.no = no;
        this.name = name;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "no=" + no +
                ", name='" + name + '\'' +
                '}';
    }
}