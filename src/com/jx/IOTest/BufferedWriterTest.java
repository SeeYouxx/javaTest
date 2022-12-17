package com.jx.IOTest;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.OutputStreamWriter;

/**
 * @program: java
 * @description:          BufferWriter:带有缓冲的字符输出流
 *                        OutputStreamWriter  转换流
 * @author:
 * @create: 2020-11-19 21:58
 */
public class BufferedWriterTest {
    public static void main(String[] args) throws Exception {
        //带有缓冲区的字符输出流
        //BufferedWriter out = new BufferedWriter(new FileWriter("copy"));

        BufferedWriter out =new BufferedWriter(new OutputStreamWriter(new FileOutputStream("copy",true)));
        out.write("hello world");
        out.write("\n");
        out.write("hello kitty!");

        out.flush();

        out.close();

    }


}