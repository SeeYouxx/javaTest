package com.jx.annotation;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * @program: java
 * @description:
 * @author:
 * @create: 2020-12-03 22:44
 */
public class ReflectAnnotationTest {
    public static void main(String[] args) throws Exception {

       Class c = Class.forName("com.jx.annotation.MyAnnotationTest02");
       //判断上面是否有@MyAnnotation
        //System.out.println(c.isAnnotationPresent(MyAnnotation02.class));
        if (c.isAnnotationPresent(MyAnnotation02.class)){
            //获取该注解对象
            MyAnnotation02 myAnnotation02 =(MyAnnotation02)c.getAnnotation(MyAnnotation02.class);
            System.out.println("类上面的注解对象"+ myAnnotation02);

            //获取注解对象的属性
            String  s =myAnnotation02.value();
            System.out.println(s);

        }


    }
}