class Solution {
    public int missingNumber(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++)
            sum+=nums[i];
        int n=nums.length;    
        return n*(1+n)/2-sum;
    }
}