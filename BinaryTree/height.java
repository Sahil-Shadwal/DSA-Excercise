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
    public static int sumOfNodes(Node root){
        if(root == null){
            return 0;
        }
        int ls = sumOfNodes(root.left);
        int rs = sumOfNodes(root.right);
        return ls + rs + root.data;
    }
    public static int diameter(Node root){
        if(root == null){
            return 0;
        }
        int lh = heightBs(root.left);
        int rh = heightBs(root.right);
        int diameter = lh + rh + 1;
        int max = Math.max(lh,rh);
        return Math.max(diameter,max);
    }
    public static void main(String args[]){
    /*
                    1                         
                   / \
                  2   3
                 / \ / \
                4  5 6  7
            //    /         \
            //   39          8
            //     \40  
                
    */  
    Node root = new Node(1);
    root.left = new Node(2);
    root.right = new Node(3);
    root.left.left = new Node(4);
    root.left.right = new Node(5);
    root.right.left = new Node(6);
    root.right.right = new Node(7);
    root.right.right.right = new Node(19);
    root.left.left.left = new Node(39);
    root.left.left.left.right = new Node(40);


    System.out.println(heightBs(root));
    System.out.println("----------------");
    System.out.println(countNodes(root));
    System.out.println("----------------");
    System.out.println(sumOfNodes(root));
    System.out.println("----------------");
    System.out.println(diameter(root));
    }
}
