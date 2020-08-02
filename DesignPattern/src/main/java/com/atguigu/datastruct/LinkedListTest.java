package com.atguigu.datastruct;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;
import com.sun.org.apache.bcel.internal.generic.NEW;
import sun.security.util.Length;

import javax.sound.midi.Soundbank;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class LinkedListTest {

    public static void main(String[] args) {

        MyLinkedList linkedList = new MyLinkedList();

        linkedList.addNode(5);
        linkedList.addNode(3);
        linkedList.addNode(1);
        linkedList.addNode(2);
        linkedList.addNode(7);
        linkedList.addNode(6);
        linkedList.addNode(7);
        linkedList.addNode(1);

        System.out.println("linkedlist的值都有:" + linkedList.printList());

        System.out.println("linkedlist的长度为:" + linkedList.size());

        System.out.println("给list排序返回最小值：" + linkedList.orderList());

        linkedList.addNode(9);

        System.out.println("linkedlist的值都有:" + linkedList.printList());

        linkedList.deleteNode(2);

        System.out.println("linkedlist的值都有:" + linkedList.printList());

        MyLinkedList linkedList2 = linkedList;

        System.out.println("linkedlist2的值都有:" + linkedList.printList());

        linkedList.addNode(3, 8);

        System.out.println("linkedlist2的值都有:" + linkedList.printList());

//        linkedList.removeRepeat();
//
//        System.out.println("linkedlist的值都有:" + linkedList.printList());

        System.out.println("倒数第6个的值是:" + linkedList.getBackWords(6));
        linkedList.LinkedListReverse();
        System.out.println("链表翻转的值是:" + linkedList.printList());


        linkedList.printListReversely();

        linkedList.DownListReversely();

        System.out.println(linkedList.printList());

    }

}




class MyLinkedList{

     //链表头的引用，一个链表主要结构就是链表头；
     Node headNode = null;
     private int size;

    public MyLinkedList(){

    }

     public MyLinkedList(MyLinkedList linkedList){
         this.headNode = linkedList.headNode;
     }

     //获取链表的长度
     public int size(){
         return size;
     };

    //删除链表中重复数据

//    public void removeRepeat(){
//        Node tmp = headNode;
//        Node pre = null;
//        Map<Object,Object> tmpMap = new HashMap<>();
//        while (tmp != null){
//
//            if (tmpMap.containsKey(tmp.object)){
//                pre.nextNode = tmp.nextNode;
//            } else {
//                tmpMap.put(tmp.object, 1);
//                pre = tmp;
//            }
//            tmp = tmp.nextNode;
//        }
//    }


    public void removeRepeat(){
        Node p = headNode;

        while (p != null){

           Node q = p;

           while (q.hasNextNode()){

               if (p.object == q.nextNode.object){
                   p.nextNode = q.nextNode.nextNode;
               } else {
                   q = q.nextNode;
               }
           }
           p = p.nextNode;
        }

    }

    /**
     * 返回倒数第几个的值
     * @param index
     * @return
     */

    public Object getBackWords(int index){

        if (index < 0 || index > size){
            throw new ArrayIndexOutOfBoundsException();
        }


        Node nodeTmp = headNode;
        int tmpCount = 0;

        while (nodeTmp.hasNextNode()){

            if (tmpCount == index - 1){
                break;
            }
            tmpCount++;
            nodeTmp = nodeTmp.nextNode;

        }

        Node nodeTmp2 = headNode;

        while (nodeTmp.nextNode != null){
            nodeTmp = nodeTmp.nextNode;
            nodeTmp2 = nodeTmp2.nextNode;
        }

        return nodeTmp2.object;



    }



     //可动态的获取链表长度
    public int getSize(){

        int length = 0;

        Node tmp = headNode;

        if (tmp.nextNode != null){

            tmp = tmp.nextNode;
            length ++;
        }

        return length;
    }


    public void addNode(int index, Object object){

        Node node = new Node(object);

        //最小的就在第一位插入，最大就在最后一位插入
        if (index < 0 || index > size){
            throw new ArrayIndexOutOfBoundsException();
        }

        if (index == 0){
            //插入第一个节点
            addFirst(node);
        } else if (index == size){
            //正常插入
            addNode(node);
        }
        Node preNode = headNode;

        Node curNode = headNode.nextNode;


        int i = 0;
        while (curNode.hasNextNode()){
            i++;
            if (i == index){
                preNode.nextNode = node;
                node.nextNode = curNode;
            }
            curNode = curNode.nextNode;
            preNode = preNode.nextNode;

        }
    }

    /**
     * 插入第一个节点
     * @param node
     */
    public void addFirst(Node node){
        //将node的下一个节点指向headNode
        node.nextNode = headNode;
        //将node赋给headnode
        headNode = node;
        size++;
    }


     //给链表中添加节点
     public void addNode(Object object){

         Node node = new Node(object);
         //若链表为空
         if (null == headNode){
             headNode = node;
             size ++;
             return;
         }

         Node tmp = headNode;
         //若链表的下一个节点不为空，则将链表的下一个节点返回，直到这个节点的下一个节点为空；
         while (tmp.nextNode != null){
             tmp = tmp.nextNode;
         }
         tmp.nextNode = node;
         size ++;
     }

     public void deleteNode(int index){
         //若链表的索引位置小于0或者索引位置大于等于长度，那么就越界；
         if (index < 0 || index >= this.size){
             throw new ArrayIndexOutOfBoundsException();
         }

         //若删除链表第一个位置，则直接让第二个位置为头节点
         if (index == 0){
             this.headNode = headNode.nextNode;
             size --;
             return ;
         }

         int i = 1;
         //指定第一个节点为
         Node preNode = headNode;
         //指定下一个节点
         Node curNode = preNode.nextNode;

         while (curNode.nextNode != null){

             //若当前索引位置，等于遍历次数，那么就将当前节点的上一个节点指向当前节点的下一个节点；
             if (i == index){
                 preNode.nextNode = curNode.nextNode;
                 size --;
                 return;
             }
             curNode = curNode.nextNode;
             preNode = preNode.nextNode;
             i ++;
         }
     }

     //链表排序， 并返回头结点的值

    public int orderList(){

        Node curNode = headNode;
        int temp = 0;
        while (curNode.hasNextNode()){

            Node nextNode = curNode.nextNode;
            while (nextNode != null){

                if ((int)curNode.object > (int) nextNode.object){
                    temp = (int)curNode.object;
                    curNode.object = nextNode.object;
                    nextNode.object = temp;
                }
                nextNode = nextNode.nextNode;
            }
            curNode = curNode.nextNode;
        }
       return (int) headNode.object;
    };


    public String printList(){
        Node tmp = headNode;
        String a = "[";
        while (tmp != null){
            a = a + tmp.object;
            if (tmp.hasNextNode()){
                a = a+",";
            }
            tmp = tmp.nextNode;
        }
        return a + "]";
    }


    public boolean hasNextNode(Node node){
        return node.nextNode != null;
    }


    /**
     * 实现链表翻转
     *
     */
    public void LinkedListReverse(){

      Node pNode = headNode;

      Node preNode = null;

      //若遍历未结束
      while (pNode != null ){
          //获取当前节点的下一个节点保存，防止后面赋值时丢失掉
          Node pNext = pNode.nextNode;

          //若下一个节点为空的话
          if (pNext == null){

              //只做当前节点的下一个节点赋值动作，其他的动作无需在做，直接跳出循环；
              pNode.nextNode =  preNode;

              this.headNode = pNode;

              break;
          }


          //当前节点的前一个节点，就是当前节点的指针指向；
          pNode.nextNode = preNode;

          //当前节点赋给前一个节点保存给下一个节点使用；
          preNode = pNode;

          //当前节点的下一个节点就是要执行的接下来的节点；
          pNode = pNext;
      }






    }






    public void printListReversely(){

        Node node = headNode;

        StringBuffer str = new StringBuffer("[") ;
        ListReversely(node, str);
        str = str .append("]");

        System.out.println(str);

    }


    public void ListReversely(Node node, StringBuffer str){


        if (node != null){
            //判断链表是否有下一个节点
            ListReversely(node.nextNode, str);

            str = str.append(node.object).append(", ");
        }


    }


    public void DownListReversely(){

        Node node = headNode;
        Node nodeTmp = new Node("1");

        this.headNode = DownList(node);

    }


    public Node DownList(Node node){

        Node secondnext = node.nextNode;

        if (node.hasNextNode()){
            //判断链表是否有下一个节点
            Node newNode = DownList(node.nextNode);

            secondnext.nextNode = node;

            node.nextNode = null;

            return newNode;
        } else {
            return node;
        }


    }



    //链表节点
     static class Node{
        Node nextNode = null;
        Object object = null;
        public Node(Object object){
            this.object = object;
        }

        public void setObject(Object object) {
            this.object = object;
        }

        public boolean hasNextNode(){
             return nextNode !=  null;
        }
    }
}
