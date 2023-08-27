class Solution {
    // public int solve(int[] nums, int n){
    //     if(n<0){
    //         return 0;
    //     }
    //     if(n==0){
    //         return nums[n];
    //     }
    //     int incl = solve(nums,n-2) + nums[n];
    //     int excl = solve(nums,n-1) + 0;
    //     return Math.max(incl, excl);
    // }
    // public int rob(int[] nums) {
    //     int n = nums.length;
    //     int ans = solve(nums,n-1);
    //     return ans;
    // }
    public int rob(int[] nums){
        int n = nums.length-1;
        int[] dp = new int[n+1];
        if(nums.length < 2){
            return nums[n];
        }
        dp[0] = nums[0];
        dp[1] = Math.max(nums[1],nums[0]);
        for(int i=2; i<=n; i++){
            int incl = dp[i-1] ;
            int decl = dp[i-2] + nums[i];
            dp[i] = Math.max(incl,decl);
        }
        return dp[n];
    }
}