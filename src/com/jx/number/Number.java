package com.jx.number;

import java.math.BigDecimal;
import java.text.DecimalFormat;

/**
 * @program: java
 * @description:
 * @author:
 * @create: 2020-10-18 15:47
 */
public class Number {

    public static void main(String[] args) {



        /**
         *    数字格式化：
         *          # 代表任意数字
         *          ，代表千分位
         *          . 代表小数点
         *          0 代表不够时补0
         *
         *
         *          ###，##.##
         *               表示：加入千分位 保留两位小数
         *
         * */
        DecimalFormat  df = new DecimalFormat("###,##.##");

        String s =df.format(1234.561232);
        System.out.println(s);


       // DecimalFormat  df2 =new DecimalFormat("###,##.0000");

      //  BigDecimal  属于大数据  精度极高 不属于基本数据类型  属于java对象（引用数据类型）


        BigDecimal v1 =new BigDecimal(600);
        BigDecimal v2 =new BigDecimal(300);

        BigDecimal v3 =  v1.divide(v2);
        System.out.println(v3);

    }
}