package BinaryTree;

import java.util.*;

public class lowestcommonanc {
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static boolean getPath(Node root, int n, ArrayList<Node> path){
        if(root == null){
            return false;
        }
        
        path.add(root);

        if(root.data == n){
            return true;
        }

        boolean foundLeft = getPath(root.left,n,path);
        boolean foundRight = getPath(root.right,n,path);

        if(foundLeft || foundRight){
            return true;
        }
        path.remove(path.size()-1);
        return false;

    }
    public static Node lca( Node root, int n1, int n2){
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();

        getPath(root, n1, path1);
        getPath(root, n2, path2);

        //last common ancestor
        int i = 0;
        for(; i< path1.size() && i< path2.size(); i++){
            if(path1.get(i) != path2.get(i)){
                break;
            }
        }
        Node lca = path1.get(i-1);
        return lca;
    }
    public static Node lca2(Node root, int n1, int n2){
        if(root == null) {
            return null;
        }
        if(root.data == n1 || root.data == n2) {
            return root;
        }

        Node  leftLca = lca2(root.left,n1,n2);
        Node rightLca = lca2(root.right, n1,n2);

        if(rightLca == null){
            return leftLca;
        }
        if(leftLca ==null){
            return rightLca;
        }
        return root;
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
        System.out.println(lca(root,5,7).data);
        System.out.println(lca2(root,5,4).data);

    }
}
