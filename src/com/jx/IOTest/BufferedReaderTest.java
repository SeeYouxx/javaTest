package com.jx.IOTest;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * @program: java
 * @description:      带有缓冲区的字符输入流
 *                      使用这个流的时候不需要自定义char数组，或者说不需要自定义byte数组，自带缓冲
 *
 * @author:
 * @create: 2020-11-19 15:37
 */
public class BufferedReaderTest {
    public static void main(String[] args) throws Exception {

        FileReader fir = new FileReader("Copy02.java");
        //当一个流的构造方法中需要一个流的时候，这个被传进来的流叫做：节点流
        //外部负责包装的这个流，叫做：包装流，还有一个名字叫做：处理流。
        //像当前这个程序来说：FileReader就是个节点流，BufferedReader就是包装流/处理流
        BufferedReader br = new BufferedReader(fir);

        //读一行
//        String firstLine = br.readLine();
//        System.out.println(firstLine);

        //br.readLine() 方法读取一个文本行,但不带换行的
       String s = null;
       while ((s = br.readLine()) != null){
           System.out.println(s);
       }


        br.close();
    }
}