package com.jx.exception;

/**
 * @program: java
 * @description:             总结异常中的关键字
 *                    异常捕捉：
 *                         try
 *                         catch
 *                         finally
 *
 *                         throws 在方法声明位置上使用 表示上报异常信息给调用者
 *                         throw 手动抛出异常
 * @author:
 * @create: 2020-10-22 13:46
 */
public class MyExceptionTest {

    public static void main(String[] args) {
        MyException  e =new MyException("用户不为空");

        e.printStackTrace();

    }
}