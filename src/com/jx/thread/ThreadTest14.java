package com.jx.thread;

import javax.naming.NameNotFoundException;

/**
 * @program: java
 * @description:
 * @author:
 * @create: 2020-11-29 10:19
 */
public class ThreadTest14 {

    public static void main(String[] args) {

          Num num  = new Num(1);

          Thread t1 = new Thread(new Num1(num));
          Thread t2 = new Thread(new Num2(num));

          t1.setName("t1");
          t2.setName("t2");

          t1.start();
          t2.start();

    }
}


class Num1 implements  Runnable{

    private  Num  num ;

    public Num1(Num num) {
        this.num = num;
    }

    @Override
    public void run() {

        synchronized (num) {
            while (true) {
                if (num.getI() %2 == 0){
                    try {
                        num.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName() + "-->"+ num.getI());
                num.setI(num.getI() + 1);
                num.notifyAll();

            }
        }

    }
}

class Num2 implements  Runnable{
    private Num num ;

    public Num2(Num num){
        this.num = num;
    }

    @Override
    public void run() {

        synchronized (num) {
            while (true) {
                if (num.getI() % 2 !=0){
                    try {
                        num.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName()+"-->"+num.getI());
                num.setI(num.getI() + 1);
                num.notifyAll();
            }
        }


    }
}


class Num{
    private   int i;

    public Num(int i) {
        this.i = i;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }


}

