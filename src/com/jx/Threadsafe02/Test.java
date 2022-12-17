package com.jx.Threadsafe02;

/**
 * @program: java
 * @description:
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