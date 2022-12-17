package com.jx.reflect;

import java.util.Date;

/**
 * @program: java
 * @description:     反射机制：
 *                          通过java语言中的反射机制可以操作字节码文件
 *                          优点类似于黑客（可以读和修改字节码文件）
 *                          通过反射机制可以操作代码片段（class文件）
 *
 *                      反射机制的相关类在哪个包下
 *                           java.lang,reflect.*;
 *
 *                      反射机制相关的重要的类
 *                           java.lang.Class: 代表整个字节码,代表一个类型    代表整个类
 *
 *                           java.lang.reflect.Method:   代表字节码中的方法字节码   代表类中的方法
 *
 *                           java.lang.reflect.Constructor:  代表字节码中的构造方法字节码   代表类中的构造方法
 *
 *                           java.lang.reflect.Field:  代表字节码中的属性字节码   代表类中的成员变量（静态变量和实例变量）
 *
 *
 *                           java.lang.Class:
 *                           public class User{
 *                               //Field
 *                               int no;
 *
 *                               //Constructor
 *                               public User(){
 *
 *                               }
 *                               public  User(int no){
 *                                   this.no = no;
 *                               }
 *
 *                              //Method
 *                              public void setNo(int no){
 *                                  this.no = no;
 *                              }
 *                              public int getNo(int no){
 *                                   return no;
 *                              }
 *                            }
 *
 *
 *                    要操作一个类的字节码，需要首先获取到这个类的字节码
 *                        三种方式：
 *                               第一种：Class c = Class.forName("完整类名带包名")；
 *                               第二种：Class c = 对象.getClass();
 *                               第三种：Class c = 任何类型.class;
 *
 *
 *
 *                    类加载器：
 *                          专门负责加载类的命令/工具
 *                          ClassLoader
 *
 *                          JDK中自带了3个类加载器
 *                            启动类加载器：rt.jar
 *                            扩展类加载器: ext/*.jar
 *                            应用类加载器: classpath
 *
 *
 *                         假设有这样一段代码：
 *                              String s ="abc";
 *
 *                              代码在开始执行之前，会将所需要类全部加载到JVM中
 *                              通过类加载器加载，看到以上代码类加载器会找到String.class
 *                              文件，找到就加载，那么是怎么进行加载的
 *                                    首先通过“启动类加载器”加载
 *                                    注意：启动类加载器专门加载：C:\Program Files\Java\jdk1.8.0_201\jre\lib\rt.jar
 *                                    rt.jar中都是JDK最核心的类库
 *
 *                                如果通过“启动类加载器”加载不到的时候，
 *                                会通过“扩展类加载器”加载。
 *                                   注意：扩展类加载器专门加载：C:\Program Files\Java\jdk1.8.0_201\jre\lib\ext\*.jar
 *
 *                                如果“扩展类加载器”没有加载到，那么会通过“应用类加载器”加载。
 *                                    注意：应用类加载器专门加载：classpath中的jar包（class文件）
 *
 *                               java中为了保证类加载的安全，使用了双亲委派机制。
 *                               优先从启动类加载器中加载，这个称为“父”
 *                               "父"无法加载到，再从扩展类加载器中加载，
 *                               这个称为“母” 双亲委派，如果都加载不到，
 *                               才会考虑从应用加载器中加载，直到加载到为止
 *
 *
 *
 *
 *
 * @author:
 * @create: 2020-11-29 15:37
 */
public class ReflectTest01 {
    public static void main(String[] args) {
        /*
          Class.forName()
          1.静态方法
          2.方法的参数是一个字符串
          3.字符串需要的是一个完整类名
          4.完整类名必须带有包名。java.lang包也不能省略

         */
        Class c1 = null;

        try {
            c1 = Class.forName("java.lang.String"); //c1代表String.class文件，或者c1代表String类型
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


        //java中任何一个对象都有一个方法：getClass（）
        String s = "abc";
        Class x = s.getClass();   //x代表String.class字节码文件，x代表String类型。
        System.out.println( c1 == x); //true(== 判断的是对象的内存地址)


        //第三种方式：java语言中任何一种类型，包括基本数据类型，它都有.class属性
        Class z = String.class; //z代表String类型
        Class k = Date.class;   //k代表Date类型

        System.out.println(x == z); //true
    }
}