package com.jx.test01;

/**
 * @program: java
 * @description:
 * @author:
 * @create: 2020-10-07 17:37
 */
/*   匿名内部类：
 *         内部类   在类的内部又定义了一个新的类  被称为内部类
 *
 *         内部类的分类：
 *                     静态内部类：类似静态变量
 *                     实例内部类：类似实例变量
 *                     局部内部类：类似局部变量
 *
 *
 *         匿名内部类是局部内部类的一种
 *
 *
 */
public class Test {

    //该类在类的内部 所以称为内部类
//    被称为静态内部类
    static class Inner1 {

    }

    //该类在类的内部 被称为内部类
//    没有static叫做实例内部类
    class Inner2 {

    }

    public void doSome() {
        //局部变量
        int i = 100;
        //该类在类的内部，所以称为内部类
        //局部内部类
        class Inner3 {

        }
    }
        public void doOther(){
        //doSome方法中的局部内部类Inner3，在doOther方法中不能用


        }

        public static void main(String[] args) {
        MyMath  MM = new MyMath();
        MM.sum(new Computer(){
              public  int sum (int a ,int b){
                  return a+b;
              }
        },100,200);
       }
    }

interface Computer{
       int sum (int a, int b);

}

//class  ComputerImpl implements  Computer{
//    @Override
//    public int sum(int a, int b) {
//        return a+b;
//    }
//}

class  MyMath {
       public  void sum(Computer c, int x, int y){
            int value = c.sum(x,y);
            System.out.println(value);
       }


}







