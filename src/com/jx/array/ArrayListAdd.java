package com.jx.array;

/**
 * @program: java
 * @description:
 * @author:
 * @create: 2020-10-09 16:42
 */
public class ArrayListAdd {
//    数组扩容效率较低
//    先创建大容量数组   然后将小数组中的数据一个一个拷贝出去
    public static void main(String[] args) {

           int[] src ={1,11,22,3,4};

           int[] dest = new  int[20];
           System.arraycopy(src ,0,dest,0,src.length);
           for (int i=0; i<dest.length;i++){

               System.out.println(dest[i]);
           }
    }
}