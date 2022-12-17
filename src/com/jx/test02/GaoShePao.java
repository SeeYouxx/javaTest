package com.jx.test02;

/**
 * @program: java
 * @description:
 * @author:
 * @create: 2020-10-22 19:08
 */
public class GaoShePao extends Weapon implements Shootable {

    @Override
    public void shoot() {
        System.out.println("开炮");
    }
}