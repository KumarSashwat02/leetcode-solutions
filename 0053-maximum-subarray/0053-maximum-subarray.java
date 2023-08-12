class Solution {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int Sum = 0;

        for(Integer i : nums){
            if(Sum < 0){
                Sum = 0;
            }
            Sum += i;
            max = Math.max(max , Sum);
        }
        return max;
    }
}