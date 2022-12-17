package com.jx.thread;



import java.util.concurrent.Callable;

import java.util.concurrent.FutureTask;  //JUC包下的，属于java的并发包

/**
 * @program: java
 * @description:        实现线程的第三种方式：
 *                             实现Callable接口
 *
 *                             可以获取到线程的执行结果
 *
 *                            效率比较低，在获取t线程执行结果的时候，当前线程受阻塞，效率较低
 * @author:
 * @create: 2020-11-28 12:45
 */
public class ThreadTest12 {
    public static void main(String[] args) throws Exception {
        //第一步：创建一个"未来任务类"对象
        FutureTask task = new FutureTask<>(new MyCalleble1());
        //创建线程对象
        Thread t = new Thread();

        //启动线程
        t.start();

        //这里是main方法，这是在主线程
        //主线程中，怎么获取t线程的返回结果
        //get（）方法的执行会导致“当前线程阻塞”
        Object obj =  task.get();
        System.out.println("线程执行结果：" +obj);


    }
}

class MyCalleble1 implements  Callable<Integer> {

//call()方法就相当于run方法 只不过有返回值

    @Override
    public Integer call() throws Exception {

        //线程执行一个任务，执行之后可能会有一个执行结果
        //模拟执行
        System.out.println("call method begin");
        Thread.sleep(1000*1);
        System.out.println("call method end!");
        int a = 100;
        int b = 200;
        return a+b;
    }
}


