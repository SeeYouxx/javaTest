package com.jx.enum1;

/**
 * @program: java
 * @description:
 * @author:
 * @create: 2020-10-19 08:56
 */
public class EnumTest {

    public static void main(String[] args) {
        Result ret =  divide(10,2);
        System.out.println(ret);


    }


    /**
     *   以下程序  计算两个int类型数据的商 计算返回成功返回1 计算失败返回0
     */

    public static Result divide(int a, int b){
        try {
            int c = a / b;
            return Result.SUCCESS;
        }catch (Exception e){
            return Result.FAIL;
        }

    }

    /**
     *    枚举类型
     *
     *
     */

    enum Result{

        SUCCESS, FAIL

    }


}