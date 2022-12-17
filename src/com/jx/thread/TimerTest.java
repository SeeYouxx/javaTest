package com.jx.thread;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @program: java
 * @description:
 * @author:
 * @create: 2020-11-28 11:10
 */
public class TimerTest {
    public static void main(String[] args) throws Exception {

        //创建定时器对象
        Timer timer = new Timer();
        //Timer timer = new Timer();

        //指定定时任务
        //timer.schedule(定时任务,第一次执行时间l,间隔多久执行一次);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date firstTime = sdf.parse("2020-11-28 11:44:30");
        //还可以使用匿名内部类方式
        timer.schedule(new logTimerTask(),firstTime,1000 *10);

    }
}

//编写一个定时任务类
//假设这是一个记录日志的定时任务
class logTimerTask extends TimerTask{

    @Override
    public void run() {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss ");
        String strtime = sdf.format(new Date());
        System.out.println(strtime +":成功完成了一次数据备份");
    }
}