package com.jx.date;

import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * @program: java
 * @description:
 *                     System.out.println()   println（）方法不是System类的 是PrintStream类的方法
 *                     System.currentTimeMillis（）  获取1970年1月1日到系统当前时间的总毫秒数
 *                     System.gc() 建议启动垃圾回收器
 *                     System.exit（0） 退出JVM
 * @author:
 * @create: 2020-10-15 16:21
 */
public class DateTest01 {

    public static void main(String[] args) throws  Exception{
        //直接调用无参数构造方法
        Date nowtime = new Date();

        System.out.println(nowtime);

        //Date --> String
        SimpleDateFormat  sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        //在日期格式中 除了y M d H m s S这些字符不能重写
        String nowTimeStr = sdf.format(nowtime);
        System.out.println(nowTimeStr);

        //String --> Date
        String time = "2008-08-08 08:08:08 888";
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        Date dateTime =  sdf2.parse(time);
        System.out.println(dateTime);

        //获取1970年1月1日 00：00：00 000到当前系统时间的总毫秒数
       long nowTimeMillis =  System.currentTimeMillis();
        System.out.println(nowTimeMillis);


        //统计一个方法耗时
        //在调用目标方法之前记录一个毫秒数
        long begin = System.currentTimeMillis();
        print();

        long end  = System.currentTimeMillis();
        System.out.println("耗费时长"+(end - begin)+"毫秒");


    }

      public static void  print(){
           for (int i =0 ;i< 100000 ; i++){
               //System.out.println("i ="+i);

           }

      }






}