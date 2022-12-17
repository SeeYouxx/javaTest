package com.jx.thread;

/**
 * @program: java
 * @description:     线程的调度
 *                          抢占式调度模型
 *                                 那个线程的优先级比较高,抢到的cpu时间片的概率就高一些/多一些
 *                                 java采用的就是抢占式调度模型
 *
 *                          均分式调度模型
 *                                 平均分配cpu时间片.每个线程占有的cpu时间片时间长度一样
 *                                 平均分配.一切平等
 *                                 有一些编程语言,线程调度模型采用的是这种方式
 *
 *                   java提供和线程调度有关系的方法
 *
 *                                 实例方法:
 *                                      void setPriority(int newPriority) 设置线程的优先级
 *                                      int getPriority() 获取线程优先级
 *                                      最低优先级1
 *                                      默认优先级是5
 *                                      最高优先级10
 *                                      优先级比较高的获取cpu时间片可能会多一些(但也不完全是,大概率是多的)
 *
 *                                 静态对象:
 *                                      static void yield() 让位方法
 *                                      暂停当前正在执行的线程对象,并执行其他线程
 *                                      yield()方法不是阻塞方法,让当前线程让位.让给其他线程使用
 *                                      yield()方法的执行会让当前线程从"运行状态"回到"就绪状态"
 *
 *                                 实例方法:
 *                                     void join()
 *                                      合并线程
 *                                      class MyThread extends Thread{
 *                                          public void doSome(){
 *                                              MyThread2 t = new MyThread2();
 *                                              t.join();    //当前线程进入阻塞.t线程执行,直到t线程结束,当前线程才可以继续
 *
 *                                          }
 *                                      }
 *                                      class MyThread2 extends Thread{
 *
 *                                      }
 *
 *
 * @author:
 * @create: 2020-11-24 21:45
 */
public class ThreadTest08 {
    public static void main(String[] args) {
        //让位，当前线程暂停，回到就绪状态，让给其他进程
        Thread t = new Thread(new MyRunnalbe5());
        t.setName("t");
        t.start();

        for (int i =1 ;i<=1000; i++){
            System.out.println(Thread.currentThread().getName() + "--->" + i);

        }



    }
}
class MyRunnalbe5 implements  Runnable{


    @Override
    public void run() {
             for (int i =0 ; i<10000 ; i++){
                  if (i % 100 == 0){
                      Thread.yield();
                  }
                 System.out.println(Thread.currentThread().getName()+ "-->" + i);
             }
    }
}