package Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderOfTree {
    public static ArrayList<ArrayList<Integer>> levelOrder(Node root,ArrayList<ArrayList<Integer>> list){
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int cnt = q.size();
            ArrayList<Integer> level = new ArrayList<>();
            for(int i=0;i<cnt;i++){
                Node x = q.remove();
                if(x.left!=null)
                    q.add(x.left);
                if(x.right!=null)
                    q.add(x.right);
                level.add(x.value);
            }
            list.add(level);
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
        ArrayList<ArrayList<Integer>> list = levelOrder(root,new ArrayList<>());
        System.out.print("["+" ");
        for(ArrayList<Integer> level : list){
            System.out.print("[");
            for(int node : level){
                System.out.print(" "+node+" ");
            }
            System.out.print("]");
        }
        System.out.print(" "+"]");
    }
}
