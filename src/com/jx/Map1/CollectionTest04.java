package com.jx.Map1;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @program: java
 * @description:         Contains  方法
 *                        存放在集合中的类型   一定要重写equals方法
 *
 * @author:
 * @create: 2020-10-31 10:41
 */
public class CollectionTest04 {

    public static void main(String[] args) {

        Collection e = new ArrayList();

        User s1 = new User("JACK");
        e.add(s1);
        User s2 =new User("JACK");
        e.add(s2);
        e.remove(s1);


        System.out.println(e.equals(s2));
    }

}
class  User{
   private String name;

   public  User(){}

   public  User(String name){

       this.name =name;
   }

   @Override
    public  boolean equals(Object o){
       if( o == null || !(o instanceof  User)) return false;
       if ( o == this ) return true;
       User s = (User)o;
       return  s.name.equals(this.name);


   }



        }