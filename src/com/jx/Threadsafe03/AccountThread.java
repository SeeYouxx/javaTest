package com.jx.Threadsafe03;

/**
 * @program: java
 * @description:
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
        act.withdraw(money);
        System.out.println( Thread.currentThread().getName()+"对"+act.getActon()+ "取款"+money+"成功,余额"+act.getBalance());


    }
}