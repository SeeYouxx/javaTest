package com.jx.algorithm;

/**
 * @program: java
 * @description:  数组的元素查找
 *               1  一个一个挨个找
 *               2  二分法查找
 * @author:
 * @create: 2020-10-13 12:32
 */
public class ArraySearch {

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 87, 8};
        int index = arraySearch(arr, 5);
        System.out.println(index == -1 ? "yuansubucunzai" : "存在" + index);
    }


    /**
     * @Description a
     * @Parm: a
     * @reurn: a
     * @projec name: a
     * @Author: your name
     * @date: 2020/10/13
     */
    public static int arraySearch(int arr[], int ele) {
        for (int i = 0; i < arr.length; i++) {
            if (ele == arr[i]) {
                return i;
            }
        }
        return -1;
    }

}