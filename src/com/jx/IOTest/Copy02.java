package com.jx.IOTest;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @program: java
 * @description:    使用FileReader ，FileWriter进行拷贝的话，只能拷贝“普通文本”文件
 * @author:
 * @create: 2020-11-19 15:24
 */
public class Copy02 {
    public static void main(String[] args) {
        FileReader fir = null;
        FileWriter fiw = null;

        try {
            fir = new FileReader("src/com/jx/IOTest/Copy02.java");
            fiw = new FileWriter("Copy02.java");

            char[] chars =new char[1024 * 512];
            int readCount = 0;
            while((readCount = fir.read(chars)) != -1){
                fiw.write(chars,0 ,readCount);
            }

            fiw.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
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
            if (fir != null) {
                try {
                    fir.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}