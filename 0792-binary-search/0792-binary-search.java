class Solution {
    public int search(int[] nums, int target) {
        int index = -1;
        int mid = nums.length/2;
        if(target == nums[mid]){
            index = mid;
        }
        if(target > nums[mid]){
            for(int i=mid+1; i<nums.length; i++){
                if(nums[i] == target)
                index = i;
                
            }
        }
        for(int i=0; i<mid; i++){
            if(nums[i] == target){
                index = i;       
            }
        }
        return index;
    }
}