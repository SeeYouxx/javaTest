package com.jx.reflect;

/**
 * @program: java
 * @description:      Class.forName()
 *
 *                       只希望一个类的静态代码块执行，其它代码一律不执行
 *
 *                       可以使用：
 *                             Class.forName("完整类名")；
 *                            这个方法的执行会导致类加载，类加载时，静态代码块执行
 *
 * @author:
 * @create: 2020-11-30 18:43
 */
public class ReflectTest04 {
    public static void main(String[] args) {

        try {
            Class.forName("com.jx.reflect.MyClass");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}

class MyClass {

    //静态代码块在类加载时执行，并且只执行一次
    static {
        System.out.println("MyClass类的静态代码块执行了");
    }

}