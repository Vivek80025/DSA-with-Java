import java.util.HashMap;

public class Fibonacci {
    //Recursive Approach
    //time complexit:O(2^n)
    //space complexity:O(n)
    public static long fibRec(int n){
        //base case
        if(n<=1){
            return n;
        }
        return fibRec(n-2)+fibRec(n-1);
    }

    //Memoization Approach(DP)
    //time complexit:O(n)
    //space complexity:O(n)
    public static HashMap<Integer,Long> t = new HashMap<>();
    public static long fibMemo(int n) {
        if (n <= 1) {
            return n;
        }
        if (t.containsKey(n)) {
            return t.get(n);
        } else {
            long fibVal = fibMemo(n - 2) + fibMemo(n - 1);
            t.put(n, fibVal);
            return fibVal;
        }
    }

    //tabulation Approach(DP)
    //time complexit:O(n)
    //space complexity:O(n)
    public static long fibTab(int n){
        long[] t = new long[n+1];
        t[0] = 0;
        t[1] = 1;
        for(int i=2;i<n+1;i++){
            t[i] = t[i-1]+t[i-2];
        }
        return t[n];
    }

    //without Dp(optimized fibTab)
    //most optimized
    //time complexit:O(n)
    //space complexity:O(1)
    public static long fib(int n){
        long first = 0;
        long sec = 1;
        long third;
        for(int i=2;i<n+1;i++){
            third = first+sec;
            first = sec;
            sec = third;
        }
        return sec;
    }


    public static void main(String[] args) {
        int n = 60;
        // 0 1 1 2 3 5 8
        System.out.println(n+"th fibonacci number is: "+fib(n));
    }
}
