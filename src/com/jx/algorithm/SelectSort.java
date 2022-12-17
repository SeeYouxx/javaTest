package com.jx.algorithm;

/**
 * @program: java
 * @description:
 * @author:
 * @create: 2020-10-12 15:38
 *
 *
 * 选择排序
 *     每一次从这堆数据中（参与比较的数据当中）选取最小的，拿着这个最小的值和最前面的数据交换位置
 */
public class SelectSort {
    public static void main(String[] args) {

           int[] arr={3,1,6,2,5};
           int count = 0;

           for (int i =0 ; i< arr.length -1; i++){
               int min = i;
               for (int j =i+1; j<arr.length; j++){
                   if (arr[j] < arr[min] ) {
                       min = j;

                   }
               }
               if (min != i){
                   int temp ;
                   temp = arr[min];
                   arr[min] = arr[i];
                   arr[i] = temp;
                   count++;
               }
           }
           System.out.println(count);
           for (int i =0; i<arr.length; i++){
               System.out.print(arr[i]+" ");
           }
    }
}