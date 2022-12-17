package com.jx.annotationTest;

import java.lang.reflect.Field;

/**
 * @program: java
 * @description:
 * @author:
 * @create: 2020-12-03 23:01
 */
public class Test {
    public static void main(String[] args) throws  Exception{
        Class  userClass = Class.forName("com.jx.annotationTest.User");
        //判断类上是否存在Id注解
       if (userClass.isAnnotationPresent(Id.class)){
           //当以一个类上面有@Id注解的时候，要求类中必须存在int类型的id属性
           //如果没有int类型的id属性则报异常
           //获取类的属性
           Field[] fields = userClass.getDeclaredFields();

           boolean isOK = false;
           for (Field field :fields){
               if ("id".equals(field.getName()) && "int".equals(field.getType().getSimpleName())){
                   //表示这个类是合法的类，有@Id注解，则这个类中必须有int类型的id
                   isOK = true;
                   break;
               }
           }
           //判断是否合法
           if (!isOK){
               throw new HasNotIdPropertyException("被@Id注解标注的类必须要有一个int类型的id属性");
           }
       }

    }
}