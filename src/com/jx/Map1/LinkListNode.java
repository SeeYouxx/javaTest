package com.jx.Map1;

import java.util.LinkedList;

/**
 * @program: java
 * @description:        单链表中的节点
 *                    节点是单向链表中最基本的单元
 *                    每一个节点Node都有两个属性
 *                      一个属性：是存储的数据
 *                      另一个属性：是下一个节点的内存地址
 *
 *
 *
 *
 *              双向链表节点
 *                    有三个节点
 *
 *
 *
 *
 *
 * @author:
 * @create: 2020-11-02 11:42
 */
public class LinkListNode {
    //存储的数据
    Object element;

    //下一个节点的内存地址
    LinkListNode next;

    public LinkListNode(Object element, LinkListNode next) {
        this.element = element;
        this.next = next;

    }
}