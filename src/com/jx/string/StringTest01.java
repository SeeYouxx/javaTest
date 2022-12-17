package com.jx.string;

/**
 * @program: java
 * @description: String表示字符串类型 属于引用数据类型 不属于基本数据类型
 *                      在java中随便使用双引号括起来的都是String对象 例如："abc" "def" "hello world"
 *                         java规定 双引号括起来的字符串 是不可变的
 *                         直接存储在方法区的 字符串常量池 当中的
 * @author:
 * @create: 2020-10-14 11:25
 */
public class StringTest01 {

        public static void main(String[] args) {

            /**
             *
             *    String类中常用方法：
             *               1 .char charAt(int index)
             *         char c = "中国人".charAt（1）；

             */
            char c = "中国人".charAt(1);
            System.out.println(c);


            // 2 ,int compareTo(String anotherString)
            //字符串之间比较大小不能直接使用 > < ，需要使用compareTo 方法
            int result ="abc".compareTo("abc");
            System.out.println(result);  // 0   前后一致

            int result1 ="abcd".compareTo("abce");
            System.out.println(result1);// -1  前小后大

            int result2 = "abce".compareTo("abcd");
            System.out.println(result2);// 1   前大后小


            //3   .boolean contains(CharSequence s)
            //判断前面的字符中是否包含后面的字符串
            System.out.println("HelloWorld.java".contains(".java"));



            //4  .boolean endsWith(String suffix)
            //判断当前字符串是否以某个字符串结尾
            System.out.println("test.java".endsWith(".java"));


            //5  .boolean equals(Object anObject)
            //比较两个字符串 用equals

            // .boolean equalsIgnoreCase(String anotherString)

            //  .byte[] getBytes()
            byte[] bytes = "abcdef".getBytes();
            for (int i=0 ;i<bytes.length ;i++){
                System.out.println(bytes[i]);
            }
        }
    }
