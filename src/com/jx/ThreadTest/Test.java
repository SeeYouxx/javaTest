package com.jx.ThreadTest;

/**
 * @program: java
 * @description:
 * @author:
 * @create: 2020-11-27 09:53
 */
public class Test {
    public static void main(String[] args) throws InterruptedException {
         MyClass mc = new MyClass();

         Thread t1 = new MyThread(mc);
         Thread t2 = new MyThread(mc);

         t1.setName("t1");
         t2.setName("t2");

         t1.start();
        Thread.sleep(1000);
         t2.start();
    }
}

class MyThread extends Thread{

    private  MyClass mc ;

    public  MyThread(MyClass mc){
        this.mc = mc;

    }
    public void  run(){
        if (Thread.currentThread().getName().equals("t1")){
            mc.doSome();
        }
        if (Thread.currentThread().getName().equals("t2")){
            mc.doOther();
        }

    }

}



class  MyClass {
    public synchronized  void doSome(){
        System.out.println("doSome() 开始");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("doSome() 结束");

    }
    public  void doOther(){
        System.out.println("doOther()开始");
        System.out.println("doOther() 结束");
    }
}