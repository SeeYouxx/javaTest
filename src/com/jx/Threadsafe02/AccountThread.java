package com.jx.Threadsafe02;

/**
 * @program: java
 * @description:       使用线程同步机制,解决线程安全问题
 * @author:
 * @create: 2020-11-25 13:57
 */
public class AccountThread extends  Thread{

    private Account act;

    public AccountThread(Account act) {
        this.act = act;
    }

    @Override
    public void run() {

        //run方法的执行表示取款操作
        //假设取款5000
        double money = 5000;
        //取款
       synchronized (act) {   //这种方式也可以,只不过扩大了同步的范围.效率更低了
           act.withdraw(money);
       }
        System.out.println( Thread.currentThread().getName()+"对"+act.getActon()+ "取款"+money+"成功,余额"+act.getBalance());


    }
}