package com.jx.string;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @program: java
 * @description:
 * @author:
 * @create: 2020-10-16 13:01
 */
public class StringTest02 {

    public static void main(String[] args) {
        Date time = new Date(1);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        String strTime = sdf.format(time);
        System.out.println(strTime);

        Date time2 = new Date(System.currentTimeMillis()- 1000*60*60*24);
        String strTime2 = sdf.format(time2);
        System.out.println(strTime2);

    }


}