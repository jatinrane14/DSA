import java.util.LinkedList;
import java.util.Queue;

import javax.management.Query;

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
    public static void levelOrder(Node root){
        Queue<Node> que = new LinkedList<>();
        que.add(root);
        while (!que.isEmpty()) {
            Node curr = que.poll();
            System.out.print(curr.data+" ");
            if(curr.left!=null){
                que.add(curr.left);
            }
            if(curr.right!=null){
                que.add(curr.right);
            }
        }
    }
}
public class TreeTut {
    
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        
        Tree1 tree = new Tree1();
        tree.postOrder(root);
        System.out.println();
        tree.preOrder(root);
        System.out.println();
        tree.inOrder(root);
        System.out.println();
        tree.levelOrder(root);
    }
}
