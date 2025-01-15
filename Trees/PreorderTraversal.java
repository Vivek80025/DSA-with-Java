package Trees;

import java.util.ArrayList;

public class PreorderTraversal {
    public static ArrayList<Integer> traverse(Node root,ArrayList<Integer> list){
        if(root==null)
            return list;
        list.add(root.value);
        traverse(root.left,list);
        traverse(root.right,list);
        return list;
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        ArrayList<Integer> list = traverse(root,new ArrayList<>());
        for(int node : list)
            System.out.print(node+" ");
    }
}
