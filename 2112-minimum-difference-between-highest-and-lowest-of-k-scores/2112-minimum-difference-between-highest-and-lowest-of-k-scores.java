class Solution {
    public int minimumDifference(int[] nums, int k) {
        int result = Integer.MAX_VALUE;
        Arrays.sort(nums);
        for(int i=0; i<=nums.length-k; i++){
            int val = nums[i+k-1] - nums[i];
            result = Math.min(result,val);
        }
        return result;
    }
}