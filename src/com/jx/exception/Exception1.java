package com.jx.exception;

/**
 * @program: java
 * @description:               UML 统一建模语言
 * @author:              编译时异常 ： 受检异常（checkedException） 受控异常           运行时异常：非受检异常 非受控异常
 *
 *                       java处理异常的两种方式：
 *                               在方法声明的位置上  使用throws关键字 【异常上抛  调用者需要对异常继续处理 调用者可自处理 可继续上抛直到终止程序执行】
 *                               使用try..catch进行异常捕捉
 * @create: 2020-10-19 09:17
 */
public class Exception1 {

    public Exception1(String s) {
    }

    public static void main(String[] args) {

        //编译时异常
       //第一种   自处理  调用者不知道
        try {
            doSome();
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }

    }

   /* public static void main(String[] args)  throws ClassNotFoundException {
      继续上抛



    }*/

    /**
     *   属于编译时异常
     * @throws ClassNotFoundException
     */
    public static void doSome() throws ClassNotFoundException{

        System.out.println("doSome()");
    }

}