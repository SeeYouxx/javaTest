package com.jx.IOTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @program: java
 * @description:         FileInputStream类的其他常用方法：
 *                              int available（）  返回流当中剩余的没有读到的字节数量
 *                              long skip(long n)  跳过几个字节不读
 *
 * @author:
 * @create: 2020-11-18 16:11
 */
public class FileInputStreamTest03 {
    public static void main(String[] args) {
        FileInputStream fis = null;

        try {
            fis =new FileInputStream("src/tess");
            /*System.out.println("总字节数"+fis.available());

            int readbyte = fis.read();

            System.out.println("剩下多少个字节没有读："+ fis.available());
*/
            byte[] bytes =new byte[fis.available()];    //不适用大文件

            int readbyte =fis.read(bytes);

            System.out.println(new String(bytes));


            //skip
            fis.skip(2);
            System.out.println(fis.read());


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}