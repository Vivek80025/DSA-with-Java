package Trees;

public class SymmetricTree {
    public static boolean check(Node left ,Node right){
        if(left==null && right==null)
            return true;
        if(left==null || right==null)
            return false;
        if(left.value != right.value){
            return false;
        }
        return check(left.left,right.right) && check(left.right,right.left);
    }
    public static boolean isSymmetric(Node root){
        return check(root,root);
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(2);
        root.left.left = new Node(3);
        root.left.right = new Node(4);
        root.right.left = new Node(4);
        root.right.right = new Node(3);
        System.out.println("the tree is symmetric : "+isSymmetric(root));
    }
}
