package BinaryTree;

import java.util.*;

public class kth {
    static class Node{
        int data;
        Node left, right;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    //level order transversal
    public static void levelOrder(Node root){
        if(root == null){
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        

        while(!q.isEmpty()){
            Node currNode = q.remove();
            if(currNode == null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else {
                System.out.print(currNode.data+ " ");
                if(currNode.left != null){
                    q.add(currNode.left);
                }
                if(currNode.right != null){
                    q.add(currNode.right);
                }
            }
        }
    }
    public static void ktth(Node root, int k) {
        if (root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        int count = 1;
        while (!q.isEmpty()) {
            Node currNode = q.remove();
            if (currNode == null) {
                if (count == k) {
                    // Stop after printing all nodes at the kth level
                    break;
                }
                System.out.println(); // This line can be removed if printing of levels is not required
                count++;
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                if (count == k) {
                    System.out.print(currNode.data + " ");
                }
                if (currNode.left != null) {
                    q.add(currNode.left);
                }
                if (currNode.right != null) {
                    q.add(currNode.right);
                }
            }
        }
    
    }

    public static void klevel( Node root, int level, int k){
        if(root == null){
            return ;
        }
        if( level == k){
            System.out.print(root.data + " ");
            return;
        }

        klevel(root.left, level+1, k);
        klevel(root.right, level+1, k);
    }
    public static void main(String args[]){
         /*
                    1                         
                   / \
                  2   3
                 / \ / \
                4  5 6  7
        */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        // levelOrder(root);
        // ktth(root, 2);
        klevel(root, 1, 3);
    }
}
