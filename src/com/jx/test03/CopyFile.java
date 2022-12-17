package com.jx.test03;

import java.io.*;

/**
 * @program: java
 * @description:
 * @author:
 * @create: 2020-11-21 18:37
 */
public class CopyFile {

    public static void main(String[] args) {
        //拷贝源
        File srcFile = new File("E:\\workspace\\guizhou\\文档");
        //拷贝目标
        File destFile = new File("D:\\Test");

        //调用方法
        copyDir(srcFile,destFile);
        
        
    }

/**
 * @Author： Lenovo
 * @Description：
 * @Date：  2020/11/21 19:08
 * @Param：
 * @return：
 */
    private static void copyDir(File srcFile, File destFile) {
        if (srcFile.isFile()){
            //srcFile如果是个文件的话,递归结束
            FileInputStream in = null;
            FileOutputStream out =null;

            try {
                in = new FileInputStream(srcFile);

                String path = (destFile.getAbsolutePath().endsWith("\\") ? destFile.getAbsolutePath() : destFile.getAbsolutePath()+"\\")+ srcFile.getAbsolutePath().substring(3);
                out = new FileOutputStream(path);

                byte[] bytes = new byte[1024*1024];
                int readCount =  0;
               while ((readCount = in.read(bytes)) != -1){
                    out.write(bytes,0,readCount);
                }
                out.flush();

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (out == null) {
                    try {
                        out.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                if (in != null) {
                    try {
                        in.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
                 return;
        }

        //获取源下面的目录
        File[] files = srcFile.listFiles();
        for (File file :files){
            /*//获取所有文件绝对路径
            System.out.println(file.getAbsolutePath());*/
            if (file.isDirectory()){
                String srcDir = file.getAbsolutePath();
                String destDir = (destFile.getAbsolutePath().endsWith("\\") ? destFile.getAbsolutePath() : destFile.getAbsolutePath()+"\\")+ srcDir.substring(3);
                File newFile = new File(destDir);
                if (!newFile.exists()){
                    newFile.mkdirs();
                }
            }
            //递归调用
            copyDir(file,destFile);
        }


    }
}