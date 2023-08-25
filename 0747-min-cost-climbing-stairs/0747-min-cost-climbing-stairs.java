class Solution {
    // by recurssion
    // public int solve(int[] cost, int n ){
    //     if(n==1 || n==0){
    //         return cost[n];
    //     }
    //     int ans = cost[n] + Math.min(solve(cost,n-1) , solve(cost,n-2));
    //     return ans;
    // }
    // public int minCostClimbingStairs(int[] cost) {
    //     int n = cost.length-1;
    //     return Math.min(solve(cost,n-1),solve(cost,n));
    // }

    // by memoization
    // public int solve(int[] cost, int n ,int[] storage){
    //     if(n==1 || n==0){
    //         storage[n] = cost[n];
    //         return storage[n];
    //     }
    //     int ans = cost[n] + Math.min(solve(cost,n-1,storage) , solve(cost,n-2,storage));
    //     storage[n] = ans;
    //     return storage[n];
    // }
    // public int minCostClimbingStairs(int[] cost) {
    //     int n = cost.length-1;
    //     int[] storage = new int[n+1];
    //     return Math.min(solve(cost,n-1,storage),solve(cost,n,storage));
    // }


    // By dynamic programming
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length-1;
        int dp[] = new int[n+1];
        dp[0] = cost[0];
        dp[1] = cost[1];
        for(int i=2; i<=n; i++){
            dp[i] = cost[i] + Math.min(dp[i-2],dp[i-1]);
        }
        return Math.min(dp[n],dp[n-1]);
    }
}