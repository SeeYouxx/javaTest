package com.jx.Map1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @program: java
 * @description:   HashMap集合
 *                      1. HashMap集合底层是哈希表/散列表的数据结构
 *                      2.哈希表
 *                           是一个数组和单向链表的结合体
 *                           数组：在查询方面效率很高，随机增删方面效率很低
 *                           单向链表：在随机增删方面效率较高，在查询方面效率很低
 *                           哈希表将以上的两种数据结构融合在一起，充分发挥他们各自的优点
 *                      3.HashMap集合底层的源代码：
 *                            public class HashMap{
 *
 *                                //HashMap底层实际上就是一个数组。（一维数组）
 *                                Node<k,V>[] table;
 *
 *                                //静态内部类HashMap，Node
 *                                static class Node<K,V>{
 *                                    final int hash; //哈希值（哈希值是key的hashCode（）方法的执行结果.hash值通过哈希函数/算法，可以转换存储成数组的下标）
 *                                    final K key;
 *                                    V value;
 *                                    Node<K,V> next;
 *
 *                                }
 *
 *                            }
 *                            哈希表/散列表： 一维数组 ，这个数组中每一个元素是一个单向链表。（数组和链表的结合体）
 *                                        注： 同一个单向链表上所有节点的hash相同 因为他们的数组下标是一样的 但同一个链表上的k
 *                                        和k的equals方法肯定返回的是false，都不相等
 *                       4.掌握的是：
 *                           map.put(k)
 *                                    1.先将k，v封装到Node对象当中
 *                                    2.底层会调用k的hashCode()方法得出hash值
 *                                 然后通过哈希函数/哈希算法 将hash值转换成数组的下标 下标位置上如果没有任何元素
 *                                 就把Node添加到这个位置上了，如果说下标对应的位置上有链表，此时会拿着k和链表上每一
 *                                 个节点中的k进行equals 如果所有的equals方法返回都是false，那么这个新节点将会被添
 *                                 加到链表的末尾。如果其中有一个equals返回了true，那么这个节点的value将会被替代
 *
 *                          v = map.get(k)
 *                                  先调用k的hashCode()方法得出哈希值，通过哈希算法转换成数组下标，通过数组下标快速
 *                                定位到某个位置上，如果这个位置上什么也没有 返回null 如果这个位置上有单向链表，那么会
 *                                拿着参数k和单向链表上的每个节点中的k进行equals，如果所有equals方法返回false，那么get
 *                                方法返回null，只要其中一个节点的k和参数k equals的时候返回true，那么此时这个节点的value
 *                                就是我们要找的value，get方法最终返回这个要找的value
 *
 *
 *                          HashMap集合key部分的特点：
 *                              无序，不可重复
 *                              为什么无序？ 因为不一定挂到那个单向链表上
 *                              不可重复是怎么保证的？ equals方法来保证HashMap集合的key不可重复
 *                              如果key重复了，value会覆盖
 *
 *                              放在HashMap集合key部分的元素其实就是放到HashSet集合中了
 *                              所以HashSet集合中的元素也需要同时重写hashCode（）+ equals（）方法
 *
 *
 *                              重写hashCode（）方法返回值固定为某个值， 会导致底层哈希表变成了纯单向链表  （散列分布不均匀）
 *                              重写hashCode（）方法返回值设定为不一样的值， 会导致底层哈希表变成了一维数组  （散列分布不均匀）
 *
 *
 *                              放在HashMap集合key部分的元素 以及放在HashSet集合中的元素，需要同时重写hashCode（）和equals（）
 *
 *
 *                              HashMap集合的默认初始化容量是16，默认加载因子是0.75
 *                                这个默认加载因子是当HashMap集合底层数组的容量达到75%的时候，数组开始扩容
 *                                注： hashMap集合初始化容量必须是2的倍数，
 *                                    因为达到散列均匀，为了提高HashMap集合的存取效率，所必须的
 * @author:
 * @create: 2020-11-05 16:39
 */
public class HashMapTest01 {
    public static void main(String[] args) {

         Map<Integer,String> map =new HashMap<>();
         map.put(1111,"zhangsan");
         map.put(6666,"zhansan");
         map.put(7777,"zhan");
         map.put(2222,"zhaoliu");
         map.put(2222,"king");//key重复的时候value会自动覆盖

        System.out.println(map.size());

       /* Set<Map.Entry<Integer,String>> set = map.entrySet();
        for (Map.Entry<Integer,String> i : set){
            System.out.println(i.getKey()+ "=" + i.getValue());
        }
*/
       Set<Integer> keys = map.keySet();
       for (Integer key : keys){
           System.out.println(key+ "=" + map.get(key));
       }
    }
}