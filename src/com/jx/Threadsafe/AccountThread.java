package com.jx.Threadsafe;

/**
 * @program: java
 * @description:              synchronized有三种写法：
 *
 *                                           1.同步代码块
 *                                            灵活
 *                                            synchronized（线程对象）{
 *                                                同步代码块
 *                                            }
 *
 *                                            2.在实例方法上使用synchronized
 *                                            表示共享对象一定是this
 *                                            并且同步代码块是整个方法
 *
 *                                            3.在静态方法上使用synchronized
 *                                            表示找类锁
 *                                            类锁永远只有一把
 *                                            就算创建了100个对象，那类锁也只有一把
 *
 *                                  对象锁：一个对象一把锁，100个对象100把锁
 *                                  类锁：100个对象，也可能只有一把类锁
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