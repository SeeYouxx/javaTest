package com.jx.Threadsafe;

/**
 * @program: java
 * @description:
 * @author:
 * @create: 2020-11-25 13:43
 */
public class    Account {
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