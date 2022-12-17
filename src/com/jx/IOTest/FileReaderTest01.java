package com.jx.IOTest;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @program: java
 * @description:      文件字符输入流，只能读取普通文本
 *                      读取文本内容时，比较方便，快捷
 * @author:
 * @create: 2020-11-19 14:57
 */
public class FileReaderTest01 {
    public static void main(String[] args) {

        FileReader fir = null;

        try {
            fir = new FileReader("File");

            char[] chars = new char[4];
            fir.read(chars);            //按照字符的方式读取
            for ( char s : chars){
                System.out.println(s);
            }


           /* char[] chars = new char[4];
            int readCount =0;
            while((readCount =fir.read(chars))!= -1){
                System.out.println(new String(chars,0,readCount));
            }
*/

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
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