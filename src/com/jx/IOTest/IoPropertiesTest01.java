package com.jx.IOTest;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.util.Properties;

/**
 * @program: java
 * @description:       Io + Properties的联合应用
 *
 *
 *                   非常好的设计理念：
 *                         以后经常改变的数据，可以单独写到一个文件中，使用程序动态读取，
 *                         将来只需要修改这个文件的内容，java代码不需要改动，不需要重新
 *                         编译，服务器也不需要重启，就可以拿到动态的信息；
 *
 *                   类似于以上机制的这种文件叫做属性配置文件
 *
 *                   java规范中有要求：属性配置文件建议以.properties结尾，但这不是必须的
 *                   这种以.properties结尾的文件在java中称为：属性配置文件
 *                   其中properties是专门存放属性配置文件的一个类
 * @author:
 * @create: 2020-11-23 10:45
 */
public class IoPropertiesTest01 {
    public static void main(String[] args) throws Exception{

        /**
         *   Properties 是一个Map集合，key和value都是String类型，
         *   想将userinfo文件中的数据加载到Properties对象当中
         */

        FileReader reader = new FileReader("userinfo");

        Properties pro = new Properties();

        //请用Properties对象的load方法将文件中的数据加载到Map集合中
        pro.load(reader);//文件中的数据顺着管道加载到Map集合中，其中等号=左边做key，右边做value

        String name = pro.getProperty("username");
        System.out.println(name);

        String password = pro.getProperty("password");
        System.out.println(password);

    }
}