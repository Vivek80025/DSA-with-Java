public class MatrixChainMulti {

    //Recursive approach
    public static int solveRec(int[] arr,int i,int j){
        //basecase
        if(i>=j){
            return 0;
        }
        int ans = Integer.MAX_VALUE;
        for(int k=i;k<j;k++){
            int temp = solveRec(arr,i,k) + solveRec(arr,k+1,j) + arr[i-1] * arr[k] * arr[j];
            ans = Math.min(ans,temp);
        }
        return ans;
    }

    //Memoization approach
    public static int solveMemo(int[] arr,int i,int j,int[][] t){
        //basecase
        if(i>=j){
            return 0;
        }

        if(t[i][j] != -1){
            return t[i][j];
        }

        int ans = Integer.MAX_VALUE;
        for(int k=i;k<j;k++){
            int temp = solveMemo(arr,i,k,t) + solveMemo(arr,k+1,j,t) + arr[i-1] * arr[k] * arr[j];
            ans = Math.min(ans,temp);
        }
        return t[i][j] = ans;
    }

    //no need for tabulation

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,3};
        int n = arr.length;

        //table for Memoization
        int[][] t = new int[n+1][n+1];
        for(int i=0;i<n+1;i++){
            for(int j=0;j<n+1;j++){
                t[i][j] = -1;
            }
        }

        System.out.println("minimum operation(cost) required for above Matrix Multiplication: "+solveMemo(arr,1,n-1,t));
    }
}
