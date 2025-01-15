package BinarySearchTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node{
    int val;
    Node left , right;
    public Node(int val){
        this.val = val;
        left = null;
        right = null;
    }
}
public class BstIntro {
    //function to printing BST in level order traversal.
    public static void bfs(Node root){
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        System.out.println("printing the BST: ");
        while(!q.isEmpty()){
            int size = q.size();
            for(int i=0;i<size;i++){
                Node x = q.remove();
                if(x.left != null)
                    q.add(x.left);
                if(x.right != null)
                    q.add(x.right);
                System.out.print(x.val+" ");
            }
            System.out.println();
        }
    }
    //function to create BST
    public static Node insertIntoBst(Node root,int value){
        if(root==null){
            root = new Node(value);
            return root;
        }
        if(value<root.val){
            root.left = insertIntoBst(root.left,value);
        }
        else {
            root.right = insertIntoBst(root.right,value);
        }
        return root;
    }
    //function to take input from user
    public static void takeInput(Node root){
        int value;
        Scanner sc = new Scanner(System.in);
        value = sc.nextInt();
        while(value != -1){
            root = insertIntoBst(root,value);
            value = sc.nextInt();
        }
        bfs(root);
    }
    public static void main(String[] args) {
        System.out.println("enter value to create BST: ");
        takeInput(null);
    }
}
