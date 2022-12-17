package com.jx.IOTest;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @program: java
 * @description:        File类和四大家族没有关系,所以File不能完成文件的读和写
 *
 *                      File对象:
 *                          文件和目录路径名的抽象表示形式.
 *                             一个File对象又可能对应的是目录,也可能是文件
 *
 *                     File类的常用方法:
 *
 *
 * @author:
 * @create: 2020-11-21 17:28
 */
public class FileTest01 {
    public static void main(String[] args) throws Exception {
        File f1 = new File("D:\\file");

        //判断是否存在
        System.out.println(f1.exists());

        /*//如果D:\file不存在 则以文件的形式创建出来
        if (!f1.exists()){
            //以文件形式创建
            f1.createNewFile();
        }*/

       /* //如果D:\file不存在,则以目录的形式创建出来
        if (!f1.exists()){
            //以目录的形式新建
            f1.mkdir();
        }*/

      //创建多级目录
        File f2 = new File("D:/a/b/c/d/e/f");
       /* if (!f2.exists()){
            //多重目录的形式新建
            f2.mkdirs();

        }*/


       File f3 = new File("E:\\workspace\\java\\temp");
       //获取文件的父路径
        String parentPath = f3.getParent();
        System.out.println(parentPath);
        File parentFile = f3.getParentFile();
        System.out.println("获取绝对路径:" + parentFile.getAbsolutePath());

        File f4 = new File("copy");
        System.out.println("绝对路径:"+f4.getAbsolutePath());

        //获取文件最后一次修改时间
        long haoMiao = f4.lastModified();//这个毫秒是从1970年到现在的总毫秒数

        Date time = new Date(haoMiao);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSSS");
        String strTime = sdf.format(time);
        System.out.println(strTime);

        //获取文件大小
        System.out.println(f4.length());

         //获取当前目录的子文件
        File f = new File("E:\\workspace\\java");
        File[] files = f.listFiles();
        for (File fs : files){
            // System.out.println(fs.getAbsolutePath());
            System.out.println(fs.getName());
        }


    }

}