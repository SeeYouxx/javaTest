package com.jx.thread;

import org.omg.IOP.TAG_JAVA_CODEBASE;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: java
 * @description:    使用wait()和notify()实现生产者和消费者模式
 *
 *                            生产者负责生产,消费线程负责消费
 *                            生产线程和消费线程要达到均衡
 *                            这是一种特殊的业务需求,在这种特殊情况下需要使用wait方法和notify方法
 *
 *                  wait和notify方法建立在线程同步的基础上,因为多线程要同时操作一个仓库,有线程安全问题
 *
 *                  wait方法使用:o,wait() 让正在0对象上活动的线程t进入等待状态,并且释放t线程之前占有
 *                  的0对象的锁
 *
 *                  notify方法: o.notify()让正在o对象上等待的线程唤醒,只是通知,不会释放o对象上之前占有的锁
 *
 *
 *                  模拟一个仓库
 *                    list只能最多存储一个元素
 * @author:
 * @create: 2020-11-28 22:23
 */
public class ThreadTest13 {
    public static void main(String[] args) {
            //创建一个仓库对象
            List list = new ArrayList();

            Thread t1 = new Thread(new Producer(list));
            Thread t2 = new Thread(new Consumer(list));

            t1.setName("生产者线程");
            t2.setName("消费者线程");

            t1.start();
            t2.start();
    }
}

//生产线程
class  Producer implements Runnable{
    //仓库
    private List list;

    public Producer(List list) {
        this.list = list;
    }

    @Override
    public void run() {
        //一直生产(死循环)
        while (true){
            //给仓库对象list加锁
            synchronized (list){
                if (list.size()>0){//大于0 说明仓库中已有一个元素
                    //当前线程进入等待状态
                    try {
                        //当前线程进入等待状态,并且释放Producer之前占有的list集合的锁
                        list.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //程序能够执行到这里说明仓库是空的
                Object obj = new Object();
                list.add(obj);
                System.out.println(Thread.currentThread().getName() + "-->" + obj);
                //唤醒消费者消费
               list.notifyAll();

            }



        }

    }
}

//消费线程
class Consumer implements Runnable{

    //仓库
    private  List list;

    public Consumer(List list){
        this.list = list;

    }

    @Override
    public void run() {
        //一直消费
        while(true){
            synchronized (list){
                if (list.size() == 0){
                    try {
                        //仓库已经空了
                        //消费者线程等待,释放掉list集合的锁
                        list.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //说明仓库中有数据,进行消费
                Object obj = list.remove(0);
                System.out.println(Thread.currentThread().getName()+ "-->" + obj);
                //唤醒生产者生产
                list.notifyAll();
            }
        }
    }
}