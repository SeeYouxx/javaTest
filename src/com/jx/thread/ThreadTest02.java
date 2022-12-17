package com.jx.thread;

/**
 * @program: java
 * @description:
 * @author:
 * @create: 2020-11-23 22:01
 */
public class ThreadTest02 {
    public static void main(String[] args) {
        //创建一个可运行的对象
       // MyRunnale r =new MyRunnale();
        //将可运行的对象封装成一个线程对象
       // Thread t =new Thread(r);


        Thread t = new Thread(new MyRunnale());
        //启动线程
        t.start();

        for (int i = 0 ; i < 1000; i++){
            System.out.println("主线程——>"+i);
        }


    }

    }



//这并不是一个线程类，是一个可运行的类，它还不是一个线程
class  MyRunnale implements Runnable{


    @Override
    public void run() {
        for (int i = 0 ; i < 1000; i++){
            System.out.println("分支线程——>"+i);
        }

    }
}