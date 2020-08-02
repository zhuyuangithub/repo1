package com.atguigu.arrays;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class TreeTest {

    public static void main(String[] args) {

        Node e = new Node(20, null, null);
        Node f = new Node(50, null, null);
        Node g = new Node(90, null, null);
        Node h = new Node(120, null, null);
        Node b = new Node(40, e, f);
        Node c = new Node(100, g, h);
        Node TreeNode = new Node(80, b, c);
//        LevelOrder(TreeNode);
//        preOrderTraveral(TreeNode);
//        HandOrderTraveral(TreeNode);

        preOrderTraveralWithStack(TreeNode);

    }
















    public static void preOrderTraveralWithStack(Node node){
        Stack<Node> stack = new Stack<Node>();
        Node treeNode = node;
        while(treeNode!=null || !stack.isEmpty()){
            //迭代访问节点的左孩子，并入栈
            while(treeNode != null){
                System.out.print(treeNode.val+" ");
                stack.push(treeNode);
                treeNode = treeNode.leftNode;
            }
            //如果节点没有左孩子，则弹出栈顶节点，访问节点右孩子
            if(!stack.isEmpty()){
                treeNode = stack.pop();
                treeNode = treeNode.rightNode;
            }
        }
    }






    public static void LevelOrder(Node node){
        LinkedList<Node> queue = new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty()){
            //出队列
            Node tmpNode = queue.pop();
            System.out.print(tmpNode.val + " ");
            if (tmpNode.leftNode != null)
                queue.add(tmpNode.leftNode);
            if (tmpNode.rightNode != null)
                queue.add(tmpNode.rightNode);
        }
    }



    //前序遍历
    public static void preOrderTraveral(Node node){
        if(node == null){
            return;
        }
        System.out.println(node.val+" ");
        preOrderTraveral(node.leftNode);
        preOrderTraveral(node.rightNode);
    }

    //中序遍历
    public static void inOrderTraveral(Node node){
        if(node == null){
            return;
        }
        inOrderTraveral(node.leftNode);
        System.out.print(node.val+" ");
        inOrderTraveral(node.rightNode);
    }


    //后续遍历
    public static void HandOrderTraveral(Node node){
        if(node == null){
            return;
        }
        HandOrderTraveral(node.leftNode);

        HandOrderTraveral(node.rightNode);

        System.out.print(node.val+" ");
    }
}


class Node{

    int val ;

    Node leftNode;

    Node rightNode;

    public Node(int val, Node leftNode, Node rightNode){
        this.val = val;
        this.leftNode = leftNode;
        this.rightNode = rightNode;
    }
}