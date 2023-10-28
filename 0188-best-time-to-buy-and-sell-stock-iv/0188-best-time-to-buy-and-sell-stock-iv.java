class Solution {
    public int maxProfit(int K, int[] prices) {
        int n = prices.length, max = 0;
        int[][][] dp = new int[n][K + 1][2];
        for(int k=0;k<=K;k++) 
            dp[0][k][1] = Integer.MIN_VALUE;
        dp[0][1][1] = -1 * prices[0];
        for (int i = 1; i < n; i++) {
            for (int k = 1; k <= K; k++) {
                dp[i][k][0] = Math.max(dp[i - 1][k][0], dp[i - 1][k][1] + prices[i]);
                dp[i][k][1] = Math.max(dp[i - 1][k][1], dp[i - 1][k - 1][0] - prices[i]);
                max = Math.max(max, dp[i][k][0]);
            }
        }
        return max;
    }
}