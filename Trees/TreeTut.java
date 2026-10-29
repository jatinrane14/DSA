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

    public boolean isIdentical(Node root1,Node root2){
        if(root1 == null && root2 == null) return true;

        if(root1 == null || root2 == null) return false;

        return root1.data == root2.data && isIdentical(root1.left, root2.left) && isIdentical(root1.right, root2.right);
    }

    public boolean isSemmatric(Node root){
        return isIdentical(root.left, root.right);
    }

    public int height(Node root){
        if(root == null) return 0;
        int left = height(root.left);
        int right  = height(root.right);
        return Math.max(left,right) + 1;
    }
}
public class TreeTut {
    
    public static void main(String[] args) {
        Tree1 tree = new Tree1();

        Integer[] arr = {1,2,3,4,5,6};
        Integer[] arr2 = {1,2,3,4,5,6};
        Node root = tree.buildTree(arr);
        Node root2 = tree.buildTree(arr2);
        
        System.out.println("========= In,Pre,Post , level order traversal ============= ");
        // tree.postOrder(root);
        // System.out.println();
        // tree.preOrder(root);
        // System.out.println();
        // tree.inOrder(root);
        // System.out.println();
        // tree.levelOrder(root);
        
        // System.out.println(tree.isIdentical(root, root2));


        System.out.println("========== Symmetric Tree ========");

        Integer[] arr3 = {1,2,2,3,4,3,6};
        Node root3 = tree.buildTree(arr3);
        System.out.println(tree.isSemmatric(root3));


        System.out.println("Height of the tree is: " + tree.height(root));
        
    }
}
