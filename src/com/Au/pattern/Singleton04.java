package com.Au.pattern;

import org.jcp.xml.dsig.internal.SignerOutputStream;
import org.jcp.xml.dsig.internal.dom.DOMUtils;

/**
 * @program: java
 * @description:   枚举
 * @author:
 * @create: 2022-10-24 17:41
 */
public class Singleton04 {
    public static void main(String[] args) {

        Singleton0 instance = Singleton0.instance;
        System.out.println(instance);
        Thread thread = new Thread();

    }


}


enum Singleton0{
    instance;

    public void toSay(String[] args) {
        System.out.println("ok");
    }

}