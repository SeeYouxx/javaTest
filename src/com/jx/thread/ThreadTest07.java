package com.jx.thread;

/**
 * @program: java
 * @description:     合理终止线程
 * @author:
 * @create: 2020-11-24 13:23
 */
public class ThreadTest07 {

    public static void main(String[] args) {
        MyRunnalbe4 r = new MyRunnalbe4();
        Thread t =new Thread(r);

        t.start();

        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        r.run =false;

    }
}



class MyRunnalbe4 implements Runnable {

    boolean run = true;

    @Override
    public void run() {



        for (int i = 0; i < 10; i++) {
            if (run) {
                System.out.println(Thread.currentThread().getName() + "-->" + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                return;

            }
        }
    }
}

