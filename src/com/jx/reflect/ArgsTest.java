package com.jx.reflect;

/**
 * @program: java
 * @description:   可变长参数
 *                      int...args  可变长参数
 *
 *
 *                    1.可变长度参数要求的参数个数是：0～N个
 *                    2.可变长度参数在参数列表中必须在最后一个位置上，而且可变长度参数只能有1个。
 *                    3.可变长度参数可以当做一个数组来看待
 *
 * @author:
 * @create: 2020-12-01 22:22
 */
public class ArgsTest {
    public static void main(String[] args) {
        m();
        m(10);
        m(10,20);

        m2(200,"abc");
        m2(500,"fbc");


        m3("我","是","一","个","中","国","人");

    }



    public static void m(int... args) {
        System.out.println("m执行了");
    }

    //必须在最后，只能有一个
    public static void m2(int a ,String... args){

    }

    public static void m3(String... args) {
        //args有length属性，说明args是一个数组
        //可以将可变长度参数当做一个数组来看
        for (int i = 0 ; i < args.length ;i++){
            System.out.println(args[i]);
        }


    }


}