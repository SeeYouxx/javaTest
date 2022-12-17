package com.jx.gl;

/**
 * @program: java
 * @description:
 * @author:
 * @create: 2020-10-10 20:32
 */
public class Rom extends Object{
    /**
     *
     */
    private  int  no;

    private  String   type;

    private  boolean status;

    public Rom() {
    }

    public Rom(int no, String type, boolean status) {
        this.no = no;
        this.type = type;
        this.status = status;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object obj) {
       if ( obj == null || !(obj instanceof Rom)) return false;
       if (this == obj) return true;
       Rom rom = (Rom)obj;
       if (this.no == rom.getNo()) return true;
       return  false;
    }

    @Override
    public String toString() {

//    把一个变量塞到一个字符串当中， 口诀：加一个双引号 双引号中间加两个加号 两个加号之间加变量名
        return "["+no+","+type+","+(status ? "空闲" : "占用")+"]";
    }

   /* public static void main(String[] args) {
        Rom  rom =new Rom(100,"单人间",true);
        System.out.println(rom);


        Rom  rom1 =new Rom(100,"单人间",true);
        System.out.println(rom.equals(rom1));
    }*/
//   ctr +  F12  查找一个类的属性和方法
}