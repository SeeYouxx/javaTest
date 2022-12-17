package com.jx.algorithm;

/**
 * @program: java
 * @description:
 * @author:
 * @create: 2020-10-12 10:30
 */

/**
 *  冒泡排序法
 */
public class BubbleSort {

    public static void main(String[] args) {
         int[] arr ={3,2,7,6,8};
         int cout=0;
         for (int i =arr.length-1 ; i > 0 ;i--){
              for (int j =0; j< i;j++){
                  cout++ ;
                   if (arr[j] > arr[j+1]){
                       int temp;
                       temp   = arr[j];
                       arr[j] = arr[j+1];
                       arr[j+1] = temp;
                   }

              }
              System.out.print(arr[i]+",");
         }
        System.out.println("比较次数：" +cout);

         for (int i = 0 ; i<arr.length ; i++){
             System.out.print(arr[i]+" ");
         }
    }


}