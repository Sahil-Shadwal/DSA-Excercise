package BinaryTree;

public class delete {
    static class Node{
        int data;
        Node left, right;

        public Node(int data){
            this.data = data;
            this.right = null;
            this.left = null;
        }
    }
    public static void deleteleaf(Node root, int value){
        if(root == null || root.left == null || root.right == null){
            return ;
        }
        if(root.left.data == value){
            root.left = null;
        }
        if(root.right.data == value){
            root.right = null;
        }
        deleteleaf(root.left, value);
        deleteleaf(root.right, value);
        System.out.println();

    }
    public static void preorder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data + " ");
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
        root.left.left = new Node(6);
        root.left.right = new Node(6);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        
        preorder(root);
        deleteleaf(root,6);
        // System.out.println("--------------");
        preorder(root);
    }
}
