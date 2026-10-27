import java.util.LinkedList;
import java.util.Queue;

import javax.management.Query;

class Node{
    int data;
    Node left;
    Node right;
    Node(){}
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


    public Node buildTree(Integer arr[]){
        int n  = arr.length;
        if(n == 0) return null;
        Queue<Node> que  = new LinkedList<>();
        Node root = new Node(arr[0]);
        que.offer(root);
        int j =1;
        while(j!=n && !que.isEmpty()){
            Node curr = que.poll();
            if(j<n&&arr[j] != null){
                curr.left = new Node(arr[j]);
                que.offer(curr.left);
            }
            j++;
            if(j<n&&arr[j]!=null ){
                curr.right = new Node(arr[j]);
                que.offer(curr.right);
            }
            j++;
        }
        return root;
    }
}
public class TreeTut {
    
    public static void main(String[] args) {
        Tree1 tree = new Tree1();

        Integer[] arr = {1,2,3,4,5,6};
        Node root = tree.buildTree(arr);

        
        tree.postOrder(root);
        System.out.println();
        tree.preOrder(root);
        System.out.println();
        tree.inOrder(root);
        System.out.println();
        tree.levelOrder(root);
    }
}
