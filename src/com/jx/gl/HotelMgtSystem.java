package com.jx.gl;

import java.util.Scanner;

/**
 * @program: java
 * @description:
 * @author:
 * @create: 2020-10-10 20:31
 */
public class HotelMgtSystem {

    public static void main(String[] args) {
/*
        Hotel hotel =new Hotel();

        hotel.print();*/
        Hotel hotel =new Hotel();

        System.out.println("  0    1    2   3" );
        Scanner s =new Scanner(System.in);

        while(true) {
            int i =s.nextInt();
            if (i == 1) {

                hotel.print();

            } else if (i == 2) {

                System.out.println("输入订房编号");
                int roomNo = s.nextInt();
                hotel.order(roomNo);

            } else if (i == 3) {

                System.out.println("请输入退房编号");
                int roomNo = s.nextInt();
                hotel.exit(roomNo);


            } else if (i == 0) {

                System.out.println("再见");

            } else {

                System.out.println("输入有误");
            }
        }


    }

}