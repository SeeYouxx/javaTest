package com.test;

/**
 * @program: java
 * @description:
 * @author:
 * @create: 2021-12-05 18:50
 */
public class test1 {



    public static int solve(int n){

        if (n <= 2){
            return  n;
        }

        int f1 = 0;
        int f2 = 1;
        int sum = 0;
        for(int i = 1; i<= n; i++){
            sum = f1 + f2;
            f1 = f2;
            f2 = sum;
        }
        return sum;

    }

    public static void main(String[] args) {

        int i =3;
        System.out.println(solve(5));

    }


}