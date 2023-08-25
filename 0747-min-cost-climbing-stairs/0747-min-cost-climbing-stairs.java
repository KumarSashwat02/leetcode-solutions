class Solution {
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
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length-1;
        int ans[] = new int[n+1];
        ans[0] = cost[0];
        ans[1] = cost[1];
        for(int i=2; i<=n; i++){
            ans[i] = cost[i] + Math.min(ans[i-2],ans[i-1]);
        }
        return Math.min(ans[n],ans[n-1]);
    }
}