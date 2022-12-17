package com.jx.Map1;

/**
 * @program: java
 * @description:     集合不能直接存储基本数据类型 另外集合也不能直接存储java对象
 *             集合存储的是对象的内存地址
 *
 *
 *             数据存储的结构就是数据结构 ： 数组 二叉树 链表 哈希表...
 *
 *             集合在java JDK 中    java.util.*
 *
 *
 *             集合分为两大类：
 *                           一个是单个方式存储方式   collection
 *                           一个是键值对方式     Map
 *
 *
 *                       Iterable（可迭代的 可遍历的）接口
 *                            iterator()
 *                                继承
 *                       Collection（集合接口）   关联                Iterator（集合对象迭代器）接口         所有集合继承Iterable的含义是所有集合都是可迭代的
 *                                                                        Iterator
 *                                                                    方法：hasNext/next/remove
 *
 *
 *                  List （接口）                  Set（接口）
 *   存储元素特点：有序可重复 存储的元素有下标       无序不可重复  集合中元素无下标
 *               存储的顺序和取出顺序相同
 *                                                                      SortedSet接口  （无序不可重复  集合中的元素可以自动排序  大小顺序排序）
 *     类： ArrayList   LinkedList   Vector         HashSet               TreeSet（二叉树）
 *      (数组数据结构)  双向链表    数组数据结构        底层是HashMap        底层是TreeMap
 *       非线程安全     非线程安全     线程安全         初始化容量是16
 *      底层是Object数组             效率低 使用较少   初始化容量建议是2的倍数
 *                                                    扩容：扩容之后是原容量的2倍
 *
 *
 *
 *
 *
 *                              Map（接口）      与collection无关   Map与key和value键值对的方式存储元素  key和value都是存储java对象的内存地址   所有Map集合的key特点 无序不可重复的
 *
 *             HashMap(非线程安全)         Hashtable（线程安全）            SortedMap（接口）
 *            底层是哈希表数据结构           底层是哈希表结构                 SortedMap集合的key存储元素的特点
 *           java8后 哈希表单向链表中的       所有方法都是synchronized         无序不可重复，集合中的key元素会自动按照大小排序 （可排序集合）
 *          元素超过8个 单向链表结构
 *        会变成红黑树数据结构，当红黑树         Properties 是线程安全的（属性类）                  TreeMap （二叉树  集合中的key可以自动按照大小顺序排序）
 *         上的节点数量小于6时，会重新把            存储元素是key value形式
 *           红黑树变成单向链表数据结构              都是以String类型
 *          扩容是：扩容之后的容量是原容量
 *         的2倍
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 * @author:
 * @create: 2020-10-23 22:22
 */
public class JiHe {
}