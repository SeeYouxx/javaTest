package com.jx.test02;

/**
 * @program: java
 * @description:
 * @author:
 * @create: 2020-10-22 19:11
 */
public class Army {

    private Weapon[] weapons;

    public Army(int count) {

        weapons = new Weapon[count];
    }


    public void addWeapon(Weapon weapon) throws AddException {
          for (int i =0; i< weapons.length ; i++){
              if (null == weapons[i]){
                  weapons[i] = weapon;
                  return;
              }
          }
              throw new AddException("武器数量以达到上限");

    }


    public void attackAll() {

        for (int i =0 ; i< weapons.length ;i++){
            if (weapons[i] instanceof  Shootable){
                Shootable shootable =(Shootable)weapons[i];
                shootable.shoot();
            }
        }

    }

    public void moveAll() {
        for(int i =0; i<weapons.length ; i++){
            if(weapons[i] instanceof Moveable){
                Moveable moveable =(Moveable)weapons[i];
                moveable.move();
            }
        }

    }
}