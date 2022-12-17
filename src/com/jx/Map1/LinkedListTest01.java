package com.jx.Map1;

import javax.xml.soap.Node;

/**
 * @program: java
 * @description:          链表数据结构
 *                                 基本的单元是节点 Node
 *                        对于单链表来说
 *                                 任何一个节点Node中都有两个属性
 *                                  第一：存储的数据
 *                                  第二：下一个节点的内存地址
 *
 *
 *                        随机增删元素效率较高（因为增删元素不涉及到大量元素位移）
 *                        查询效率较低 每一次查找某个元素的啥时候都需要从头节点开始往下遍历
 *
 *                       LinkedList集合底层也是有下标的
 *                       由于链表上的元素在空间存储上内存地址不连续
 *                       所以随机增删元素的时候不会有大量元素位移 因此随机增删效率高
 *
 *                       不能通过数学表达式计算被查找元素的内存地址 每一次查找都是从头节点遍历
 *                       直到找到为止 所以LinkedList集合检索/查找的效率较低
 *
 *
 *                       ArrayList：把检索发挥到极致（末尾添加元素效率还是很高的）
 *                       LinkedList：把随机增删发挥到极致
 *                       加元素都是往末尾添加 所以ArrayList用的比LinkedList多
 *
 *
 *                       ArrayList是非线程安全的
 * @author:
 * @create: 2020-11-02 11:38
 */
public class LinkedListTest01 {

            LinkListNode header =  null ;

            int size = 0;

            public int size(){
                return  size;
            }

            public void add(Object o){
                if (header == null){
                    header = new LinkListNode(o,null);
                }else {

                    LinkListNode currentLast = findLast(header);
                    currentLast.next =new LinkListNode(o,null);
                }
                size++;
            }


            /*
              专门查找末尾节点的方法
             */
    private LinkListNode findLast(LinkListNode linkListNode) {
                if (linkListNode.next == null){
                    return  linkListNode;
                }
                return findLast(linkListNode.next);

    }

    public void remove(Object o) {

            }
            public void modify(Object newo){

            }

            public int  find(Object o){
                return 1;
            }

}