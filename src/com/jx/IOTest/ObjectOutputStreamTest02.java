package com.jx.IOTest;

import com.jx.bean.User;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @program: java
 * @description:       一次序列多个对象
 *                              可将对象放到集合中，序列化集合
 *
 *
 *
 * @author:
 * @create: 2020-11-22 13:36
 */
public class ObjectOutputStreamTest02 {
    public static void main(String[] args) throws  Exception{

        List<User> userList = new ArrayList<>();
        userList.add(new User(1,"zhangsan"));
        userList.add(new User(1,"lisi"));
        userList.add(new User(1,"zhangku"));
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Users"));

        //序列化一个集合，这个集合对象中放了很多其他对象
        oos.writeObject(userList);

        oos.flush();
        oos.close();


    }
}