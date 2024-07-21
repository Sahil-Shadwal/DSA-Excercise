package BinaryTree;
import java.util.*;

public class lca {
    static class Node{
        int data;
        Node left, right;

        public Node(int data){
            this.data = data;
            this.right = null;
            this.left = null;
        }
    }
    public static Node lowestca( Node root, int n1, int n2){

        if(root == null || root.data == n1 || root.data ==n2){
            return root;
        }
         
        Node leftlca = lowestca(root.left, n1, n2);
        Node rightlca = lowestca(root.right, n1, n2);

        if(leftlca == null){
            return rightlca;
        }
        if(rightlca == null){
            return leftlca;
        }

        return root;
    }

    public static int lcaDist(Node root, int n){
        if(root == null){
            return -1;
        }
        if(root.data == n){
            return 0;
        }
        int leftDist = lcaDist(root.left,n);
        int rightDist = lcaDist(root.right, n);

        if(leftDist == -1 && rightDist == -1){
            return -1;
        } else if(leftDist == -1){
            return rightDist+1;
        }else {
            return leftDist+1;
        }
    }
    public static int minDist(Node root, int n1, int n2){
        Node lca = lowestca(root, n1, n2);
        int dist1 = lcaDist(root, n1);
        int dist2 = lcaDist(root, n2);

        return dist1+dist2;
    }

    public static int kancestor(Node root, int n, int k){
        if(root == null){
            return -1;
        }
        if(root.data == n){
            return 0;
        }

        int leftD = kancestor(root.left, n, k);
        int rightD = kancestor(root.right, n, k);

        if(leftD == -1 & rightD == -1){
            return -1;
        }
        int max = Math.max(leftD, rightD);
        if(max+1 == k){
            System.out.println(root.data);
        }
        return max+1;
    }
    public static int transform(Node root) {
        if(root == null){
            return 0;
        }
        int leftChild = transform(root.left);
        int rightChild = transform(root.right);

        int data = root.data;

        int newLeft = root.left == null ? 0 : root.left.data;
        int newRight= root.right == null ? 0 : root.right.data;
        root.data = newLeft +leftChild+ newRight + rightChild;

        return data;
    }
    public static void preorder(Node root) {
        if(root == null){
            return;
        }
        System.out.print(root.data+ " ");
        preorder(root.left);
        preorder(root.right);
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
        // System.out.println(lowestca(root, 4, 5).data);
        // System.out.println(minDist(root, 4, 5));
        // kancestor(root, 4, 1);
        transform(root);
        preorder(root);

    }
}
