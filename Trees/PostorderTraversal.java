package Trees;
import java.util.ArrayList;
public class PostorderTraversal{
    public static ArrayList<Integer> postorderTraversal(Node root,ArrayList<Integer> list){
        if(root==null)
            return list;
        postorderTraversal(root.left,list);
        postorderTraversal(root.right,list);
        list.add(root.value);
        return list;
    }
    public static void main(String[] args){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        ArrayList<Integer> list = postorderTraversal(root,new ArrayList<>());
        for(int node : list)
            System.out.print(node+" ");

    }
}
