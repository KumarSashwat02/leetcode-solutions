class Solution {
    public int findMin(int[] nums) {
        int min = Integer.MAX_VALUE;
        int i = 0;
        int j = nums.length-1;
        while(i<=j){
            int mid = (i+j)/2;
            if(nums[i] <= nums[mid]){
                min = Math.min(min, nums[i]);
                i = mid+1;
            }
            else{
                min = Math.min(min, nums[mid]);
                j = mid-1;
            }
        }
        return min;
    }
}