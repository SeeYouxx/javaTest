package com.jx.Threadsafe;

/**
 * @program: java
 * @description:       不使用线程同步机制,多线程对同一个账户进行取款,出现线程问题
 * @author:
 * @create: 2020-11-25 15:32
 */
public class Test {
    public static void main(String[] args) {

        Account account = new Account("ac" ,10000);

        Thread t1 = new AccountThread(account);
        Thread t2 = new AccountThread(account);

        t1.setName("t1");
        t2.setName("t2");

        t1.start();
        t2.start();
    }
}