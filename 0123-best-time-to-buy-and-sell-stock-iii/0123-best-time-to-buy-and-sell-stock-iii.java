class Solution {
    public int maxProfit(int[] prices) {
        int a = 0, a1 = Integer.MIN_VALUE, b = 0, b1 = Integer.MIN_VALUE;
        for(int i=0; i<prices.length; i++){
            b = Math.max(b, b1+prices[i]);
            b1 = Math.max(b1, a- prices[i]);
            a = Math.max(a, a1 + prices[i]);
            a1 = Math.max(a1, -prices[i]);
        }
           
        return b;
    }
}