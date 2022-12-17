package com.jx.thread;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * @program: java
 * @description:        sleep睡眠太久，希望期间结束睡眠
 *                       注意：这个不是中断线程的执行，是终止线程的睡眠
 *
 * @author:
 * @create: 2020-11-24 12:23
 */
public class ThreadTest05 {
    public static void main(String[] args) {

        Thread t =new Thread(new MyRunnalbe2());
        t.setName("t");
        t.start();

        //希望5秒之后，t线程醒来（5秒之后主线程手里的活儿干完了）
        try {
            Thread.sleep(1000*5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //中断t线程的睡眠（这种中断睡眠的方法依靠了java的异常处理机制）
        t.interrupt();//干扰

    }
}

class MyRunnalbe2 implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+ "--->begin");
        try {
            Thread.sleep(1000*7);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+"--->end");
    }
}