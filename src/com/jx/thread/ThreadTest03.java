package com.jx.thread;

/**
 * @program: java
 * @description:    获取当前线程对象
 *                        Thread t = Thread.currentThread()
 *
 *                  获取线程对象的名字
 *                        String name = 线程对象.getName（);
 *
 *                  修改线程对象的名字
 *                       线程对象.setName("线程名字")；
 *
 *                  当线程没有设置名字的时候，默认的名字有什么规律
 *                       Thread-0
 *                       Thread-1
 *                       Thread-2
 *                       Thread-3
 *                       ...
 *
 * @author:
 * @create: 2020-11-24 09:35
 */
public class ThreadTest03 {
    public static void main(String[] args) {

        //创建线程对象
        MyThread2 t = new  MyThread2();
        //设置线程的名字
        //t.setName("tttt");
        //获取线程的名字
        String tName = t.getName();
        System.out.println(tName);

        //启动线程
        t.start();





    }
}


class MyThread2 extends  Thread{


    public void run(){
        for (int i =0 ;i<100;i++){
            // System.out.println("分支线程-->"+i);
            Thread t = Thread.currentThread();
            System.out.println(t.getName()+ "-->" +i);
            //System.out.println(super.getName()+ "-->" +i);
           // System.out.println(this.getName()+ "-->" +i);

        }

    }

}