package bst;

public class buildbst {
    static class Node {
        int data;
        Node left, right;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static Node bst(Node root, int value){
        if(root == null){
            root = new Node(value);
            return root;
        }
        if(root.data > value){
            root.left = bst(root.left, value);
        }else{
            root.right = bst(root.right, value);
        }

        return root;

    }
    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+ " ");
        inorder(root.right);
    }
    public static boolean search(Node root, int key){
        if(root == null){
            return false;
        }
        if( root.data == key){
            return true;
        }
        if(root.data > key){
            return search(root.left, key);
        }else{
            return search(root.right,key);

        }

    }
    public static void main(String args[]){
        int arr[] = { 8, 5, 1, 6, 10, 3, 9, 4, 2, 7};
        Node root = null;
        for(int i = 0 ; i < arr.length; i++){
            root = bst(root, arr[i]);
        }
        // inorder(root);

        System.out.println(search(root, 19));

    }
}
