package com.jx.reflect;

/**
 * @program: java
 * @description:        通过Class的newInstance（）方法来实例化对象
 *                      注意：newInstance（）方法内部实际上调用了无参构造方法，必须保证无参构造存在才可以
 *
 * @author:
 * @create: 2020-11-30 18:11
 */
public class ReflectTest02 {
    public static void main(String[] args) {

        try {
            //通过反射机制，获取Class，通过Class来实例化对象
            Class c  = Class.forName("com.jx.bean.User");//c代表User类型

            //调用无参构造方法，完成对象的创建
            Object obj = c.newInstance();

            System.out.println(obj);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }
}