class Solution {
    public int maxProfit(int[] prices) {
        int i = 0;
        int j = prices.length-1;
        int minPrice = prices[0];
        int maxp = 0;
        while(i <= j){
            maxp = Math.max(maxp, prices[i] - minPrice);
            minPrice = Math.min(prices[i], minPrice);
            i++;
        }
        return maxp;        
    }
}