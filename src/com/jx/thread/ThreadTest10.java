package com.jx.thread;

/**
 * @program: java
 * @description:    java 三大变量:
 *
 *                            实例变量:在堆中
  *                           静态变量:在方法区中
 *
 *                           局部变量:在栈中
 *
 *                           以上三大变量:
 *                             局部变量永远都不会存在线程安全问题
 *                             因为局部变量不共享(一个线程一个栈)
 *                             局部变量在栈中,所以局部变量永远都不会共享
 *
 *                          实例变量在堆中,堆只有一个
 *                          静态变量在方法区中,方法区只有一个
 *                          堆和方法区中,方法区只有一个
 *                          堆和方法区都是多线程共享的,所以可能存在线程安全问题
 *
 *                          局部变量+常量：不会有线程安全问题
 *                          成员变量：可能会有线程安全问题
 *
 *
 *
 *                          如果使用局部变量的话：
 *                              建议使用：StringBuilder
 *                              因为局部变量不存在线程安全问题，选择StringBuilder
 *                              StringBuffer效率较低
 *
 *                          ArrayList是非线程安全的
 *                          Vector是线程安全的
 *                          HashMap HashSet是非线程安全的
 *                          HashTable是线程安全的
 * @author:
 * @create: 2020-11-25 22:34
 */
public class ThreadTest10 {

    public static void main(String[] args) {

    }


}