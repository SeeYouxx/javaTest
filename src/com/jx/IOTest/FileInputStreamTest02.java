package com.jx.IOTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @program: java
 * @description:     int read(byte[] b)
 *                          一次最多读取 b.length 个字节
 *                          减少硬盘和内存的交互，提高程序的执行效率
 *                          往byte[]数组当中读
 * @author:
 * @create: 2020-11-17 12:29
 */
public class FileInputStreamTest02 {

    public static void main(String[] args) {

        FileInputStream fis = null ;

        try {
            //相对路径
            //idea默认的当前路径 工程project的根就是IDEA的默认路径
            fis = new FileInputStream("src/tess");

            //开始读，采用byte数组，一次读取多个字节，最多读取“数组.length”个字节
            byte[] bytes = new byte[4];//准备一个4个长度的byte数组，一次最多读取4个字节
            /* int readCount = fis.read(bytes);
           System.out.println(readCount); //第一次读到了4个字节
            //System.out.println(new String(bytes));
            System.out.println(new String(bytes,0,readCount));

            readCount = fis.read(bytes);//第二次只能读取到2个字节
            System.out.println(readCount);
            //System.out.println(new String(bytes));
            System.out.println(new String(bytes,0,readCount));
*/
           /* while (true){
                int readCount = fis.read(bytes);
                if (readCount  == -1){
                    break;
                }
                System.out.println(new String(bytes,0,readCount));
            }
*/

            int readCount = 0;
            while((readCount = fis.read(bytes)) != -1){
                System.out.println(new String(bytes,0,readCount));
            }

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