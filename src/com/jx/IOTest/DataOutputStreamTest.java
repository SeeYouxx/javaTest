package com.jx.IOTest;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

/**
 * @program: java
 * @description:    java.io.DataOutputStream 数据专属的流
 *                      这个流可以将数据连同数据的类型一并写入文件
 *                      注意：这个文件不是普通文本文档，（这个文件使用记事本打开）
 * @author:
 * @create: 2020-11-20 11:37
 */
public class DataOutputStreamTest {
    public static void main(String[] args) throws Exception {
        //创建数据专属的字节输出流
        DataOutputStream dos = new DataOutputStream(new FileOutputStream("data"));

        byte b = 100;
        short s = 200;
        int i = 300;
        long l = 400L;
        float f = 3.0F;
        double d = 3.14;
        boolean sex = false;
        char  c = 'a';

        dos.writeByte(b);//把数据以及数据的类型一并写入到文件当中
        dos.writeShort(s);
        dos.writeInt(i);
        dos.writeLong(l);
        dos.writeFloat(f);
        dos.writeDouble(d);
        dos.writeBoolean(sex);
        dos.writeChar(c);

        dos.flush();
        dos.close();
    }
}