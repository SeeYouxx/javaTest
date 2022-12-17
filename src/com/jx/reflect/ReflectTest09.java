package com.jx.reflect;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * @program: java
 * @description:    反编译一个类的方法
 *
 * @author:
 * @create: 2020-12-02 11:47
 */
public class ReflectTest09 {
    public static void main(String[] args) throws Exception{

        StringBuilder s =new StringBuilder();
        // Class UserServiceClass = Class.forName("com.jx.service.UserService");
         Class UserServiceClass = Class.forName("java.lang.String");


        s.append(Modifier.toString(UserServiceClass.getModifiers())+" class "+ UserServiceClass.getSimpleName()+" "+"{"+"\n");

        Method[] methods = UserServiceClass.getDeclaredMethods();
       for (Method method : methods){
           s.append("\t");
           s.append(Modifier.toString(method.getModifiers()));
           s.append(" ");
           s.append(method.getReturnType().getSimpleName());
           s.append(" ");
           s.append(method.getName());
           s.append("(");
           //参数列表
           Class[]  parameterTypes = method.getParameterTypes();
           for (Class parameterType : parameterTypes){
               s.append(parameterType.getSimpleName());
               s.append(",");
          }

           if (parameterTypes.length >0){
               s.deleteCharAt(s.length()-1);

           }

           s.append("){} \n");

       }

        s.append("}");
        System.out.println(s);
    }
}