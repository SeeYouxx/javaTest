package com.jx.lang1;

/**
 * @program: java
 * @description:
 * @author:
 * @create: 2020-10-15 16:09
 */
public class Test {
    public static void main(String[] args) {
        //String --> int

        int i  = Integer.parseInt("100");
        System.out.println( i+2);

        // int  --> String
        String s2 = i + "";
        System.out.println(s2 + 1);

        // int --> Integer
        Integer s3 = 110;

        // Integer --> int
        int s4 = s3;

        //String --> Integer
       Integer s5 = Integer.valueOf("abc");

        // Integer -->String
        String s6 = String.valueOf(5);
    }


}