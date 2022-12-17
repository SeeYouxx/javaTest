package com.jx.IOTest;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @program: java
 * @description:           文件输出流，负责写
 *                         从内存到硬盘
 * @author:
 * @create: 2020-11-18 18:23
 */
public class FileOutputStreamTest01 {

    public static void main(String[] args) {

        FileOutputStream fos  =null;

        try {
            //若已有文件 会清空文件内的内容
            //fos = new FileOutputStream("File");

            //不会清空原文件内容
            fos = new FileOutputStream("File",true);


            byte[] bytes ={97,98,99,100};

            //fos.write(bytes);
            //将bytes数组一部分写出
            fos.write(bytes,0,2);

            String s = "我是一个中国人";
            byte[] bt  =s.getBytes();
            fos.write(bt);


            fos.flush();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (fos == null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}