/**
 * @program: java
 * @description:
 * @author:
 * @create: 2020-09-25 16:23
 */
public class recursion {

         int  i = 10;

         public static void  main (String args[]) {
                method1();

                recursion i =new recursion();
                i.method2();

         }

         public static void   method1 ()  {
                recursion.doSome();

                doSome();


                recursion  t= new recursion();
                t.doOther();

                System.out.println(t.i);
         }

         public void method2() {
             recursion.doSome();

             doSome();

             this.doOther();

             doOther();

             System.out.println(this.i);
             System.out.println(i);
         }

         public  static  void  doSome(){
            System.out.println("doSome");
         }

         public   void   doOther () {
              System.out.println("doother!");

         }
}