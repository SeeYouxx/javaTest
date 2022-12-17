package com.jx.algorithm;

/**
 * @program: java
 * @description:    二分法是基于排序好的数组
 * @author:
 * @create: 2020-10-13 12:45
 */
public class ArrayUtil {
    public static void main(String[] args) {
        int[] arr = {100,200,300,230,235,600,1000,2000,9999};

        int  index = binarySearch2( arr ,200);

        System.out.println(index == -1? "yuansubucunzai": "yusushi"+index );
    }

    private static int binarySearch2(int[] arr ,int dest ) {
        int begin = 0;

        int end = arr.length - 1;

        int mid = (begin + end) / 2;

        while (begin <= end) {
            if (arr[mid] == dest) {
                return mid;
            } else if (arr[mid] < dest) {

                begin = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }


}