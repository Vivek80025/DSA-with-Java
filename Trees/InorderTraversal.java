package Trees;

import java.util.ArrayList;

class Node{
    int value;
    Node left;
    Node right;
    public Node(int value){
        this.value = value;
        left = null;
        right = null;
    }
}
public class InorderTraversal {
    public static ArrayList<Integer> inorderTraversal(Node root,ArrayList<Integer> list){
        if(root==null)
            return list;
        inorderTraversal(root.left,list);
        list.add(root.value);
        inorderTraversal(root.right,list);
        return list;
    }
    public static void main(String[] args) {
        /*
                    1
                2       3
              4   5   6   7
        */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        ArrayList<Integer>list = inorderTraversal(root,new ArrayList<>());
        for(int node : list){
            System.out.print(node+" ");
        }
    }
}
