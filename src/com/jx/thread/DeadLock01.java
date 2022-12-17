package com.jx.thread;

/**
 * @program: java
 * @description:       死锁
 *
 * @author:
 * @create: 2020-11-27 15:06
 */
public class DeadLock01 {
    public static void main(String[] args) {

         Object o1 = new Object();
         Object o2 = new Object();

         Thread t1 = new MyThread1(01,02);
         Thread t2 = new MyThread3(o1,o2);




         t1.start();
         t2.start();

    }
}

class MyThread1 extends  Thread{
    Object o1;
    Object o2;
    public MyThread1(Object o1, Object o2){
        this.o1 = o1;
        this.o2 = o2;

    }
    public void  run(){
        synchronized (o1){
            synchronized (o2){

            }
        }

    }
}

class MyThread3 extends  Thread{
    Object o1;
    Object o2;
    public MyThread3(Object o1, Object o2){
        this.o1 = o1;
        this.o2 = o2;
    }
    public void run(){
        synchronized (o2){
            synchronized (o1){

            }
        }


    }
}
