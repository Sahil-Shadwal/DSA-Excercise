package BinaryTree;

public class height {
    static class Node{
        int data;
        Node right;
        Node left;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static int heightBs(Node root){
        if(root == null){
            return 0;
        }
        int lh = heightBs(root.left);
        int rh = heightBs(root.right);
        return Math.max(lh,rh)+1;
    }
    public static int countNodes( Node root){
        if(root == null){
            return 0;
        }
        int lh = countNodes(root.left);
        int rh = countNodes(root.right);
        return lh +rh+1;
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
    root.right.right.right = new Node(19);
    System.out.println(heightBs(root));
    System.out.println(countNodes(root));
    }
}
