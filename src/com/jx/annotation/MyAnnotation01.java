package com.jx.annotation;

public @interface MyAnnotation01 {

    /*
        注解当中的属性可以是那种类型
                 byte short int lang float double boolean char String Class 枚举类型
                 以及以上每一种的数组形式

     */
    int value1();

    String value2();

    int[] value3();

    String[] value4();

    Season value5();

    Season[] value6();

    Class pType();

    Class[] pTypes();



}
