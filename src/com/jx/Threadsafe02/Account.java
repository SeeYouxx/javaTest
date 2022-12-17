package com.jx.Threadsafe02;

/**
 * @program: java
 * @description:
 * @author:
 * @create: 2020-11-25 13:43
 */
public class Account {
     //账号
     private  String acton;
      //余额
     private  double balance;

    public Account() {
    }

    public Account(String acton, double balance) {
        this.acton = acton;
        this.balance = balance;
    }

    public String getActon() {
        return acton;
    }

    public void setActon(String acton) {
        this.acton = acton;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


    //取款
    public  void  withdraw(double money){

        /*
          线程同步机制的语法:
                 synchronized(){
                //线程同步代码块
                }
              synchronized后面小括号中传的这个"数据"是相当关键的
              这个数据必须是多线程共享的数据,才能达到多线程排队

              ()中写什么?
                   那要看你想让哪些线程同步
                   假设t1.t2,t3,t4,t5 有5个线程
                   你只希望t1 t2 t3排队, t4 t5不需要排队.
                   一定要在()中写一个t1 t2 t3共享的对象,而这个对象对于t4 t5来说不是共享的



         */


       // synchronized (this){
            //取款之前的余额
            double before = this.getBalance();
            //取款之后的余额
            double after = before - money;

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //更新余额
            this.setBalance(after);

        //}

    }
}