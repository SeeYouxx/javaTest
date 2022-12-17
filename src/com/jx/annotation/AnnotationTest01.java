package com.jx.annotation;

/**
 * @program: java
 * @description:   注解:
 *                      或者叫做注释,英文单词:Annotation
 *                      注解Annotation是一种引用数据类型.编译之后也是生成xxx.class文件
 *
 *                 定义:   [修饰符列表] @interface 注解类型名{
 *
 *                 }
 *
 *
 *                 注解使用时的语法格式
 *                   @注解类型名
 *
 *                 注解可以出现在类上,属性上,方法上,变量上等...
 *                 注解还可以出现在注解类型上
 *
 *
 *
 *                JDK 内置注解:
 *                           Deprecated
 *                                   注释@Deprecated的程序元素是程序员不鼓励使用的程序元素，通常是因为它是危险的，或者因为存在更好的替代方法。
 *                          FunctionalInterface
 *                                        使用的信息注释类型，以指示在接口类型声明旨在是一个 功能接口由Java语言规范所定义的。
 *                          Override
 *                                        表示方法声明旨在覆盖超类型中的方法声明。
 *                          SafeVarargs
 *                                        程序员断言注释方法或构造函数的正文不会对其varargs参数执行潜在的不安全操作。
 *                          SuppressWarnings
 *                                        表示在注释元素（以及注释元素中包含的所有程序元素）中应该抑制命名的编译器警告。
 *
 *                 元注解:
 *                     用来标注"注解类型"的"注解" ,称为元注解
 *
 *                     常见的元注解:
 *                          Target
 *                          Retention
 *
 *                      Target 这是一个元注解 用来标注“注解类型”的“注解”
 *                      这个Target注解用来标注“被标注的注解”可以出现在哪些位置上
 *                      @Target（ElemnetType.METHOD）：表示“被标注的注解”只能出现在方法上
 *                      @Target(value={CONSTRUCTOR, FIELD, LOCAL_VARIABLE, METHOD, PACKAGE, PARAMETER, TYPE})
 *                          表示该注解可以出现在
 *                               构造方法上
 *                               字段上
 *                               局部变量上
 *                               方法上
 *                               ...
 *                               类上...
 *
 *                      Retention注解：
 *                          这是一个元注解，用来标注“注解类型”的“注解”
 *                          这个Retention注解用来标注“被标注的注解”最终保存在哪里
 *
 *                       @Retention(RetentionPolicy.SOURCE) :表示该注解只被保留在java源文件中
 *                       @Retention(RetentionPolicy.CLASS) ： 表示该注解被保存在class文件中
 *                       @Retention(RetentionPolicy.RUNTIME)：  表示该注解被保存在class文件中，并且可以被反射机制所读取
 *
 *
 *                       自定义注解
 *                           属性名为value 并且只有一个的时候 可以省略属性名
 *
 *
 *                       Retention的源代码
 *                              public @interface Retention {
 *
 *                               RetentionPolicy value();
 *                             }
 *
 *
 *                          public enum RetentionPolicy {
 *                               SOURCE,
 *                                CLASS,
 *                                RUNTIME
 *                            }
 *
 *
 *
 *
 *
 * @author:
 * @create: 2020-12-02 15:01
 */
public class AnnotationTest01 {
    public static void main(String[] args) {



    }
}