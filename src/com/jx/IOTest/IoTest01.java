package com.jx.IOTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @program: java
 * @description:                    IO流：    I:Input
 *                                            O:Output
 *                                           通过IO可以完成硬盘文件的读和写。
 *
 *                                  IO的分类：
 *                                           一：按照流的方向进行分类
 *                                             以内存作为参照物，
 *                                               往内存中去，叫做输入（Input） 或者叫做读（Read）
 *                                               从内存中出来，叫做输出（Output） 或者叫做写（Write）
 *
 *                                          二：按照读取数据方式不同进行费雷
 *                                              有的流就是按照字节的方式读取数据，一次读取一个字节byte。等同于一次读取8个二进制位.
 *                                              这种流是万能的，什么类型的文件都可以读取，包括：文本文件，图片，声音文件。视频文件等
 *
 *                                              有的流就是按照字符的方式读取数据的，一次读取一个字符，这种流就是为了方便读取普通文本
 *                                              文件而存在的，这种流不能读取：图片 声音 视频等文件，只能读取纯文本文件，连word文件
 *                                              都无法读取。
 *
 *
 *
 *                                   流的分类：
 *                                     输入流  输出流
 *                                     字节流  字符流
 *
 *
 *
 *
 *                                java.io.*;
 *
 *
 *                               java IO流四大家族：
 *
 *                                       java.io.InputStream    字节输入流
 *                                       java.io.OutputStream   字节输出流
 *
 *                                       java.io,Reader       字符输入流
 *                                       java.io.Writer       字符输出流
 *
 *                                       注：在java中只要“类名” 以Stream结尾的都是字节流，以"Reader/Writer"结尾都是字符流
 *
 *                                      都是抽象类（abstract class）
 *                                      都实现了java.io.Closeable接口,都是可关闭的，都有close（）方法
 *                                      流毕竟是一个通道，这个是内存和硬盘之间的通道，用完之后一定要关闭，
 *                                      不然会耗费（占用）很多资源，养成好习惯，用完流一定要关闭
 *
 *
 *                                     所有的输出流都实现了：
 *                                         java.io.Flushable接口，都是可刷新的，都有flush（）方法
 *                                         养成一个好习惯，输出流在最终输出之后，一定要记得flush（）
 *                                         刷新一下，这个刷新表示将通道/管道当中剩余为输出的数据，
 *                                         注： 如果没有flush（）可能会导致丢失数据
 *
 *
 *
 *                                     java.io包下需要掌握的流有16个
 *
 *
 *                                      文件专属：
 *                                         java.io.FileInputStream
 *                                          java.io.FileOutputStream        文件专属
 *                                          java.io.FileReader
 *                                          java,io.FileWriter
 *
 *
 *                                     转换流： （将字节流转换成字符流）
 *                                          java.io.InputStreamReader        转换流：（将字节流换成字符流）
 *                                          java.io.OutputStreamWriter
 *
 *
 *                                      缓冲流专属
 *                                          java.io.BufferedReader
 *                                          java.io.BufferWriter
 *                                          java.io.BufferInputStream
 *                                          java,io.BufferOutputStream
 *
 *a's
 *                                      数据流专属：
 *                                          java.io.DataInputStream
 *                                          java.io.DataOutputStream
 *
 *
 *                                     标准输出流
 *                                         java.io.PrintWriter
 *                                         java.io.PrintStream
 *
 *                                      对象专属流
 *                                        java.io.ObjectInputStream
 *                                        java.io.ObjectOutputStream
 *
 * @author:
 * @create: 2020-11-16 21:02
 */
public class IoTest01 {

    /**
     *        java.io.FileInputStream
     *        1.文件字节输入流，万能的，任何类型的文件都可以采用这个流来读
     *        2.字节的方式，完成输入的操作，完成读的操作（硬盘 --> 内存）
     *
     *        交互太频繁
     *
     */

    public static void main(String[] args) {


        FileInputStream fis = null;
        //创建文件字节流对象
        try {
            fis = new FileInputStream("E:\\workspace\\java\\temp");


          /*  int readData = fis.read(); //方法的返回值是：读到的“字节”本身
            System.out.println(readData);


            readData = fis.read();
            System.out.println(readData);

            readData = fis.read();
            System.out.println(readData);

            readData = fis.read();
            System.out.println(readData);

            readData = fis.read();
            System.out.println(readData);

            //已经读到文件的末尾，在读的时候读取不到任何数据，返回-1
            readData = fis.read();
            System.out.println(readData);*/

         /*  while(true){
               int readData =fis.read();
               if (readData == -1){
                   break;
               }
               System.out.println(readData);
           }*/

         int readData = 0;
         while( (readData = fis.read()) != -1){
             System.out.println(readData);
         }



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭流的前提是：流不为空
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