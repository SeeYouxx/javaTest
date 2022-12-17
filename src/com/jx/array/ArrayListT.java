package com.jx.array;

/**
 * @program: java
 * @description:
 * @author:
 * @create: 2020-10-10 14:26
 *
 *
 *  二维数组
 *       二维数组是一个特殊的一维数组 特殊在这个一维数组当中的每一个元素是一个一维数组
 *       二维数组静态初始化
 *
 */
public class ArrayListT {
    public static void main(String[] args) {
        int [] array ={100,200,300};

        int [][] a ={
                {100,200,300},
                {30,20,40,50},
                {6,7,9,1},
                {0}
        };

        for (int i = 0; i<a.length;i++){
            for (int j= 0; j<a[i].length ; j++){
                System.out.print( a[i][j]+" ");
            }
            System.out.println();
        }
    }

}