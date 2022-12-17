package com.jx.number;

import java.lang.reflect.Array;
import java.util.Random;

/**
 * @program: java
 * @description:
 * @author:
 * @create: 2020-10-18 16:10
 */
public class RandomTest {
    public static void main(String[] args) {

        Random random = new Random();
        int num1 = random.nextInt();
        System.out.println(num1);

        //随机产生[0～100]之间的随机数
        int num2 =random.nextInt(101);//不包括101
        System.out.println(num2);





       int[] arr = new int[5];

       for (int i =0 ; i<arr.length ; i++){
           arr[i] = -1 ;

       }


       int  index =0;

       while(index < arr.length){
           System.out.println(index);
            int num3= random.nextInt(6)+1;

            if (!contains(arr,num3)){

                arr[index++] = num3;

            }
       }
       for (int i =0 ; i<arr.length ; i++){
           System.out.println(arr[i]);
       }
    }

      public  static  boolean contains(int[] arr ,int key){

        for ( int i =0 ; i< arr.length; i++){
                 if (arr[i] == key){
                     return true;
                 }
        }
       return false;
      }

}