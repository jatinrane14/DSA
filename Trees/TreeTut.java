class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
} 
class Tree1{
    public void preOrder(Node root){
        if(root == null) return ;
        System.out.print(root.data+ " ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public void postOrder(Node root){
        if(root == null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }
    public void inOrder(Node root){
        if(root == null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }
}
public class TreeTut {
    
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        
        Tree1 tree = new Tree1();
        tree.postOrder(root);
        System.out.println();
        tree.preOrder(root);
        System.out.println();
        tree.inOrder(root);
    }
}
