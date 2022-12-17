package com.jx.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * @program: java
 * @description:
 * @author:
 * @create: 2020-12-01 15:31
 */
public class ReflectTest06 {
    public static void main(String[] args) throws  Exception {

        StringBuilder s =new StringBuilder();

        //Class studentClass = Class.forName("com.jx.bean.Student01");
        Class studentClass = Class.forName("java.lang.String");

        s.append(Modifier.toString(studentClass.getModifiers())+"class"+studentClass.getSimpleName()+" "+"{" +"\n");

        Field[] fields = studentClass.getDeclaredFields();
        for (Field field : fields){
            s.append("\t");
            s.append(Modifier.toString(studentClass.getModifiers()) );
            s.append(" ");
            s.append(field.getType().getSimpleName());
            s.append(" ");
            s.append(field.getName());
            s.append("\n");

        }

         s.append("}");
        System.out.println(s);

    }
}