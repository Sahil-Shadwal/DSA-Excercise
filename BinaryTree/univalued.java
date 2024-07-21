package BinaryTree;

public class univalued {
    static class Node{
        int data;
        Node left, right;

        public Node(int data){
            this.data = data;
            this.right = null;
            this.left = null;
        }
    }
    public static boolean isUnivalued(Node root){
        if(root == null){
            return true;
        }
        return univalue(root, root.data);
    }
    public static boolean univalue(Node root, int value){
        if(root == null){
            return true;
        }
        if(root.data != value){
            return false;
        }
        return univalue(root.left, value) && univalue(root.right, value);
    }

    public static void main(String args[]){
        /*
                    1                         
                   / \
                  1   1
                 / \ / \
                1  1 1  1
        */
        Node root = new Node(1);
        root.left = new Node(1);
        root.right = new Node(1);
        root.left.left = new Node(1);
        root.left.right = new Node(2);
        root.right.left = new Node(1);
        root.right.right = new Node(1);
        
        System.out.println(isUnivalued(root)); 
    }
}
