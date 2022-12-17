package com.jx.IOTest;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @program: java
 * @description:     文件字符输出流 写
 *                     只能输出普通文本
 *
 * @author:
 * @create: 2020-11-19 15:14
 */
public class FileWriterTest {
    public static void main(String[] args) {
        FileWriter  fiw= null;

        try {
            fiw = new FileWriter("file" ,true);

            char[] chars ={'我','是','中','国','人'};
            fiw.write(chars);
            fiw.write(chars,2,3);


            fiw.write("我是你爸爸");
            fiw.write("/n");
            fiw.write("hello world");


            fiw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (fiw != null) {
                try {
                    fiw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}