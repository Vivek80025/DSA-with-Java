package Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class LevelorderTraversal {
    public static ArrayList<Integer> traverse(Node root, ArrayList<Integer> list){
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node x = q.remove();
            if(x.left!=null)
                q.add(x.left);
            if(x.right!=null)
                q.add(x.right);
            list.add(x.value);
        }
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
        for(int node : list){
            System.out.print(node+" ");
        }
    }
}
