class Solution{
    public int solve(int index, int buy, int[] prices, int limit, int[][][] dp){
        if(index == prices.length){
            return 0;
        }
        if(limit == 0){
            return 0;
        }
        if(dp[index][buy][limit] != -1){
            return dp[index][buy][limit];
        }

        int profit = 0;
        if(buy==1){
            int buyKaro = -prices[index] + solve(index+1, 0, prices, limit, dp);
            int skipKaro = 0 + solve(index+1, 1, prices, limit, dp);
            profit = Math.max(buyKaro, skipKaro);
        }
        else{
            int sellKaro = prices[index] + solve(index+1, 1, prices, limit-1, dp);
            int skipKaro = 0 + solve(index+1, 0, prices, limit, dp);
            profit = Math.max(sellKaro , skipKaro);
        }
        dp[index][buy][limit] = profit;
        return dp[index][buy][limit];
    }

    public int solveDp(int[] prices){
        int n = prices.length;
        int [][][] dp = new int [n+1][2][3];
        
        for(int i = n-1; i>=0; i--){
            for(int j=0; j<=1; j++){
                for(int l=1; l<=2; l++){
                    int profit = 0;
                    if(j==1){
                        int buyKaro = -prices[i] + dp[i+1][0][l];
                        int skipKaro = 0 + dp[i+1][1][l];
                        profit = Math.max(buyKaro, skipKaro);
                    }
                    else{
                        int sellKaro = prices[i] + dp[i+1][1][l-1];
                        int skipKaro = 0 + dp[i+1][0][l];
                        profit = Math.max(sellKaro , skipKaro);
                    }
                    dp[i][j][l] = profit;
                }
            }
        }
        return dp[0][1][2];
    }

    public int maxProfit(int[] prices){
        // int n = prices.length;
        // int [][][] dp = new int[n][2][3];
        // for(int i=0; i<n; i++){
        //     for(int j=0; j<2; j++){
        //         for(int k=0; k<3; k++){
        //             dp[i][j][k] = -1;
        //         }
        //     }
        // }
        // return solve(0, 1, prices, 2, dp);

        return solveDp(prices);
    }
}








// class Solution {
//     public int maxProfit(int[] prices) {
//         int a = 0, a1 = Integer.MIN_VALUE, b = 0, b1 = Integer.MIN_VALUE;
//         for(int i=0; i<prices.length; i++){
//             b = Math.max(b, b1+prices[i]);
//             b1 = Math.max(b1, a- prices[i]);
//             a = Math.max(a, a1 + prices[i]);
//             a1 = Math.max(a1, -prices[i]);
//         }
           
//         return b;
//     }
// }