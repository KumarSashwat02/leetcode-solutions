class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = new int[2];
        ans[0] = -1;
        ans[1] = -1;
        if(nums.length == 1 && nums[0] == target){
            ans[0] = 0;
            ans[1] = 0;
            return ans;
        }
        int i = 0, j = 1;
        while(j<nums.length){
            if(nums[i] == target && ans[0] == -1){
                ans[0] = i;
            }
            if(nums[j] == target){
                ans[1] = j;
            }
            i++;
            j++;
        }
        if(ans[0] != -1 && ans[1] == -1){
            ans[1] = ans[0];
        }
        if(ans[0] == -1 && ans[1] != -1){
            ans[0] = ans[1];
        }
        return ans;
    }
}