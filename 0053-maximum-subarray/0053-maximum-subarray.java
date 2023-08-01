class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int curSum = 0;

        for(Integer i : nums){
            if(curSum < 0){
                curSum = 0;
            }
            curSum += i;
            maxSum = Math.max(maxSum , curSum);
        }
        return maxSum;
    }
}