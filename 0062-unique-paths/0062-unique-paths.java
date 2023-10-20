class Solution {
    public int uniquePaths(int m, int n) {
        // if(m==1 || n==1){
        //     return 1;
        // }
        // if(m<0 || n<0){
        //     return 0;
        // }
        // int down = uniquePaths(m-1, n);
        // int right = uniquePaths(m, n-1);
        // return down+right;
        int[][] dp = new int[m][n];
        dp[0][0] = 0;
        for(int[] a: dp){
            Arrays.fill(a,1);
        }
        for(int i=1; i<m; i++){
            for(int j=1; j<n; j++){
                dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }
        return dp[m-1][n-1];
    }
}