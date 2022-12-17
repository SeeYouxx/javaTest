package com.jx.service;

import com.sun.corba.se.spi.presentation.rmi.IDLNameTranslator;

/**
 * @program: java
 * @description:    用户业务类
 * @author:
 * @create: 2020-12-01 22:35
 */
public class UserService {


    /**
     * @Author： Lenovo
     * @Description：     登陆方法
     * @Date：  2020/12/1 22:35
     * @Param：
     * @return：
     */
    public boolean login (String name, String password){
        if ("admin".equals(name) && "123".equals(password)){
            return true;
        }
        return false;
    }

    /**
     * @Author： Lenovo
     * @Description：  退出系统的方法
     * @Date：  2020/12/1 22:38
     * @Param：
     * @return：
     */
    public void logout(){
        System.out.println("系统已经安全退出");
    }

}