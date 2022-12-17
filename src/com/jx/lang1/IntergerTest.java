package com.jx.lang1;

/**
 * @program: java
 * @description:
 *             八种包装类中其中6个都是数字对应的包装类， 父类是Number
 *             Number是抽象类
 *
 * @author:
 * @create: 2020-10-15 10:39
 */
public class IntergerTest {

    public static void main(String[] args) {

        Integer i = new Integer(123);
        Float a = i.floatValue();
        System.out.println(a);
        //只有 + - * / 等运算时 才会自动拆箱


        //java创建了[-128 127]常量池
        //池 ： cache ，就是缓存机制(效率高)/(耗费内存)

        System.out.println(Integer.MAX_VALUE);

        //手动装箱
        Integer x =new Integer(1000);

        //手动拆箱
        int y =x.intValue();
        System.out.println(y);

        /**
         *    空指针异常： NullPointerException
         *    类型转换异常： ClassCastException
         *    数组下标越界异常： ArrayIndexOutOfBoundsException
         *    数字格式化异常：NumberFormatException
         */

        //static int parseInt(String  s)
        // 静态方法 传参String  返回int
         int  retValue = Integer.parseInt("123");
        System.out.println(retValue + 100);


        String binaryString = Integer.toBinaryString(3);
        String hexString = Integer.toHexString(16);
        String octalString = Integer.toOctalString(8);

        Integer  i1  = Integer.valueOf(100);
        Integer  li = Integer.valueOf("100");
    }

}