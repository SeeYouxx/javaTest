package com.jx.array;

/**
 * @program: java
 * @description:
 * @author:
 * @create: 2020-10-09 10:43
 */
public class ArrayListTest02 {



    public static void main(String[] args) {

//        int[] array = new int[4];
//
//        for (int a =0 ;a< array.length ; a++){
//               System.out.println(array[a]);
//           }


         int[] array = {1,2,3};
         for (int i=0 ; i<array.length ; i++){
             System.out.println(array[i]);
         }

        Animal a1 = new Animal();
        Animal a2 = new Animal();
        Animal[]  animals = {a1, a2};

        for (int i=0; i<animals.length; i++){
            animals[i].move();
        }
    }


}


class  Animal {
       public  void  move(){
           System.out.println("Animal move");
       }
}

