package com.jx.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

/**
 * @program: java
 * @description:   反编译一个类的Constructor构造方法
 * @author:
 * @create: 2020-12-02 14:06
 */
public class ReflectTest11 {
    public static void main(String[] args) throws Exception{

        StringBuilder  s = new StringBuilder();
        Class vipClass = Class.forName("com.jx.bean.Vip");
        s.append(Modifier.toString(vipClass.getModifiers()));
        s.append(" class ");
        s.append(vipClass.getSimpleName());
        s.append("{\n");

        //拼接构造方法
        Constructor[] constructors = vipClass.getConstructors();
        for (Constructor constructor : constructors){
            s.append("\t");
            s.append(Modifier.toString(constructor.getModifiers()));
            s.append(vipClass.getSimpleName());
            s.append("(");


        //拼接参数
        Class[] constructorParameter  = constructor.getParameterTypes();
        for (Class cp :constructorParameter){
            s.append(cp.getSimpleName());
            s.append(",");
        }
        if (constructorParameter.length > 0){
            s.deleteCharAt(s.length() - 1);
        }

        s.append("){}\n");

    }
        s.append("}");
        System.out.println(s);

    }
}