package com.jx.gl;

/**
 * @program: java
 * @description:
 * @author:
 * @create: 2020-10-10 22:06
 */
public class Hotel {
    private Rom[][] roms;

    public Hotel() {

        roms = new Rom[3][10];

        for (int i = 0; i < roms.length; i++) {
            for (int j = 0; j < roms[i].length; j++) {
                if (i == 0) {
                    roms[i][j] = new Rom((i + 1) * 100 + j + 1, "单人间", true);
                } else if (i == 1) {
                    roms[i][j] = new Rom((i + 1) * 100 + j + 1, "双人间", true);
                } else if (i == 2) {
                    roms[i][j] = new Rom((i + 1) * 100 + j + 1, "豪华套房", true);

                }
            }
        }
    }

    public  void  print(){
        for (int i= 0 ;i< roms.length ;i++){
            for (int j =0 ;j<roms[i].length ; j++){
                Rom rom = roms[i][j];
                System.out.print(rom);
            }
            System.out.println();
        }
    }

    public  void  order(int roomNo){

         Rom rom = roms[ roomNo / 100 - 1][ roomNo % 100 - 1];

         rom.setStatus(false);
    }

    public void  exit(int roomNo){

        Rom rom = roms[ roomNo / 100 - 1][ roomNo % 100 - 1];

        rom.setStatus(true);

    }
}