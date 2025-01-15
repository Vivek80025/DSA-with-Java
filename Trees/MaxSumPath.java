package Trees;

public class MaxSumPath {
    static int max = Integer.MIN_VALUE;
    public static int maxSum(Node root){
        if(root==null){
            return 0;
        }
        int left = Math.max(0,maxSum(root.left));
        int right = Math.max(0,maxSum(root.right));
        max = Math.max(max,root.value + left + right);
        return root.value + Math.max(left,right);
    }
    public static void main(String[] args) {
        Node root = new Node(2);
        root.left = new Node(-7);
        root.right = new Node(5);
        root.left.left = new Node(1);
        root.left.right = new Node(3);
//        root.right.left = new Node(6);
//        root.right.right = new Node(7)
        maxSum(root);
        System.out.println("sum of max sum path is: "+max);
        max = Integer.MIN_VALUE;
    }
}
