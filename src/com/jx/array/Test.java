package com.jx.array;

/**
 * @program: java
 * @description:
 * @author:
 * @create: 2020-10-10 15:23
 */
public class Test {

     private  Object[]  elements;

     private  int index = -1;

    public Test() {
        this.elements = new Object[5];
    }

    public Test(Object[] elements) {
        this.elements = elements;
    }

    public Object[] getElements() {
        return elements;
    }

    public void setElements(Object[] elements) {
        this.elements = elements;
    }




    public  void pop(){
        if (index < 0){
            System.out.println("栈已空");
            return;
        }
        System.out.print("弹栈"+elements[index]+"元素成功");
        index --;
        System.out.println("栈帧指向"+index);

    }



    public  boolean push(Object obj){
          if (this.index >= this.elements.length-1){
              System.out.println("失败");
              return false;
          }
          index++;
          elements[index] = obj;
        System.out.println("压栈成功"+obj+"栈帧指向"+index);
        return true;
    }
}

