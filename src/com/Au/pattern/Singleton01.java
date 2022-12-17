package com.Au.pattern;

/**
 * @program: java
 * @description:  单例模式 造成内存浪费
 *
 *      单例模式8种方式:
 *           1）饿汉式（静态变量）
 *           2）饿汉式（静态代码块）
 *           3）懒汉式（）
 *           4)双重检查
 *           5）静态内部类
 *           6）枚举
 *
 *
 * @author:
 * @create: 2022-10-23 17:16
 */
public class Singleton01 {


    public static void main(String[] args) {

        Singleton instance = Singleton.getInstance();

    }
}
    //饿汉式（私有变量）
class Singleton{

    private Singleton(){}

    private final static Singleton instance = new Singleton();

//    static{
//        instance = new Singleton();
//    }

    public static Singleton getInstance(){
            return  instance;
    }
}
