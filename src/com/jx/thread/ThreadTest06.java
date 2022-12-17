package com.jx.thread;

/**
 * @program: java
 * @description:   强行终止线程
 *                    容易丢失数据   线程没有保存的数据会丢失
 * @author:
 * @create: 2020-11-24 13:17
 */
public class ThreadTest06 {
    public static void main(String[] args) {
        Thread t = new Thread(new MyRunnalbe());
        t.setName("t");
        t.start();


        try {
            Thread.sleep(1000* 5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //5秒强行终止t线程
        t.stop();//过时
    }




}

class MyRunnalbe implements Runnable{

    @Override
    public void run() {

        for (int i = 0; i<10;i++){
            System.out.println(Thread.currentThread().getName() + "-->" +i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}