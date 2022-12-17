package com.jx.IOTest;

import com.jx.bean.User;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.List;

/**
 * @program: java
 * @description:
 * @author:
 * @create: 2020-11-22 15:01
 */
public class ObjectInputStreamTest02 {
    public static void main(String[] args) throws Exception{

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Users"));

        List<User> userList =(List<User>) ois.readObject();
        for (User u : userList){
            System.out.println(u);

        }
        ois.close();


    }
}