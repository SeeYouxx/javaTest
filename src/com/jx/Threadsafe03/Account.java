package com.jx.Threadsafe03;

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
    /*
       在实例方法上可以使用synchronized
                 synchronized出现在实例方法上，一定锁的是this
                 没得挑，只能是this，不能是其他对象了
                 多以这种方式不灵活

                 另外一种缺点：synchronized出现在实例方法上，
                 表示整个方法都需要同步，可能额会无故扩大同步的范围
                 导致程序的执行效率降低，所以这种方法不常用


                 优点：
                      代码节俭
     */

    public synchronized void  withdraw(double money){
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

    }
}