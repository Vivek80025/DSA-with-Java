package Trees;

public class DiameterOfTree {
    static int max = 0;
    public static int height(Node root){
        if(root==null){
            return 0;
        }
        int left = height(root.left);
        int right = height(root.right);
        max = Math.max(max,(left + right));
        return 1+Math.max(left,right);
    }
    public static void main(String[] args) {
        /* har node se left aur right ke height ko add kro and maxdia me replace kro
           and us node se max height return kro*/
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
//        root.right.left = new Node(6);
//        root.right.right = new Node(7);
        height(root);
        System.out.println(max);
        max = 0;
    }
}
