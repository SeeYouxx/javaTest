package com.jx.IOTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @program: java
 * @description:     使用FileInputStream + FileOutputStream 完成文件的拷贝
 *                  拷贝的过程应该是一边读， 一边写
 *                  使用以上的字节流拷贝文件的时候，文件类型随意，万能的。什么样的文件都能拷贝
 * @author:
 * @create: 2020-11-19 10:57
 */
public class Copy01 {

    public static void main(String[] args) {
        FileInputStream fis =null;
        FileOutputStream fos = null;

        try {
            fis = new FileInputStream("E:\\书籍\\韩少功：阅读的年轮.txt");

            fos =  new FileOutputStream("c:/韩少功：阅读的年轮.txt");

            byte[] bytes = new byte[1024* 1024];
            int readCount = 0;
            while((readCount = fis.read()) != -1){
                fos.write(bytes,0,readCount);
            }

            fos.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos == null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
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