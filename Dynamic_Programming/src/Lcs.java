public class Lcs {

    //Tabulation
    public static int lcsTab(String s1,String s2,int m,int n,int[][] dp){
        //table initialize
        //------n
        for(int i=0;i<m+1;i++){
            for(int j=0;j<n+1;j++){
                if(i==0 || j==0){
                    dp[i][j] = 0;
                }
            }
        }
        //recursive-->iterative
        for(int i=1;i<m+1;i++){
            for(int j=1;j<n+1;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j] = 1+dp[i-1][j-1];
                }
                else{
                    dp[i][j] = Math.max(dp[i][j-1],dp[i-1][j]);
                }
            }
        }
        return dp[m][n];
    }

    //Memoization
    public static int lcsMemo(String s1,String s2,int m,int n,int[][] t){
        if(m==0 || n==0){
            return 0;
        }
        if(t[m][n] != -1){
            return t[m][n];
        }
        if(s1.charAt(m-1)==s2.charAt(n-1)){
            return t[m][n] = 1+lcsMemo(s1,s2,m-1,n-1,t);
        }
        else{
            return t[m][n] = Math.max(lcsMemo(s1,s2,m,n-1,t),lcsMemo(s1,s2,m-1,n,t));
        }
    }

    //Recursive
    public static int lcsRec(String s1,String s2,int m,int n){
        if(m==0 || n==0){
            return 0;
        }
        if(s1.charAt(m-1)==s2.charAt(n-1)){
            return 1+lcsRec(s1,s2,m-1,n-1);
        }
        else{
            return Math.max(lcsRec(s1,s2,m,n-1),lcsRec(s1,s2,m-1,n));
        }
    }
    public static void main(String[] args) {
        String s1 = "AGGTAYB";
        String s2 = "GXTXAYB";
        int m = s1.length();
        int n = s1.length();

        //memoization
        int[][] t = new int[m+1][n+1];
        for(int i=0;i<m+1;i++){
            for(int j=0;j<n+1;j++){
                t[i][j] = -1;
            }
        }

        //Tabulation
        int[][] dp = new int[n+1][m+1];

        System.out.println("Longest common subsequence is: "+lcsTab(s1,s2,m,n,dp));
    }
}
