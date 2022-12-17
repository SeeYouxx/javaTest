package com.jx.reflect;

import javax.management.monitor.StringMonitor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * @program: java
 * @description:   反射Student类当中所有的Field
 * @author:
 * @create: 2020-12-01 11:18
 */
public class ReflectTest05 {

        public static void main(String[] args) throws Exception {
            //获取整个类
            Class studentClass = Class.forName("com.jx.bean.Student01");

            String className = studentClass.getName();
            System.out.println("完整类名:"+className);


            String simpleName = studentClass.getSimpleName();
            System.out.println("简易类名："+simpleName);

            //获取类中的Filed
            Field[] fields = studentClass.getFields();
            System.out.println(fields.length);
            //取出这个Field
            Field f = fields[0];
            //取出Field它的名字
            String name =f.getName();
            System.out.println(name);

            Field[] fields1 = studentClass.getDeclaredFields();
            for (Field field :fields1){
                //获取属性的修饰符列表
                int i = field.getModifiers();
                System.out.println(i);
                //可以将这个“代号”数字转换成“字符串”
                String modifierString = Modifier.toString(i);
                System.out.println(modifierString);

                //获取属性的类型
                Class fieldType = field.getType();
                //String fName = fieldType.getName();
                String fName = fieldType.getSimpleName();
                System.out.println(fName);
                //获取属性的名字
                System.out.println(field.getName());
            }
        }
}