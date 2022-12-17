package com.Au.pattern;

/**
 * @program: java
 * @description:   静态内部类
 * @author:
 * @create: 2022-10-23 17:31
 */
public class Singleton03 {
    public static void main(String[] args) {

        Singletonn03 instance = Singletonn03.getInstance();
        System.out.println(instance.hashCode());

        Thread thread = new Thread();

    }


}

class Singletonn03{


    private static volatile Singletonn03 instance ;  //加入关键字volatile


    private Singletonn03() {
    }

    private static class SingletonInstance{
        public static final Singletonn03 instance = new Singletonn03();
    }

    public static synchronized Singletonn03 getInstance(){
        return SingletonInstance.instance;
    }

}