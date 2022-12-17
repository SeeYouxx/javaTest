package com.Au.pattern;

import java.awt.event.WindowFocusListener;

/**
 * @program: java
 * @description:   线程不安全  多线程可能创建多个对象
 * @author:
 * @create: 2022-10-23 17:31
 */
public class Singleton02 {
    public static void main(String[] args) {
        Singletonn instance = Singletonn.getInstance();
        System.out.println(instance.hashCode());
    }


}

class Singletonn{


    private static volatile Singletonn instance ;  //加入关键字volatile


    private Singletonn() {
    }



//    public static Singletonn getInstance() {
//        if (instance == null) {
//            instance = new Singletonn();
//        }
//        return instance;
//    }

//        public static synchronized Singletonn getInstance() {
//        if (instance == null) {
//            instance = new Singletonn();
//        }
//        return instance;
//    }

        public static synchronized Singletonn getInstance() {
        if (instance == null) {
            synchronized (Singletonn.class){
                if (instance == null) {
                    instance = new Singletonn();
                }
            }

        }
        return instance;
    }

}