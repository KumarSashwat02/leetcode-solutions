class Solution {
    public int search(int[] nums, int target) {
        int s = 0;
        int e = nums.length-1;
        while(s<=e){
            int mid = (s+e)/2;
            if(nums[mid] == target){
                return mid;
            }
            if(target < nums[mid]){
                e = mid-1;
            }
            else{
                s = mid+1;
            }
        }
        return -1;

















        // int index = -1;
        // int mid = nums.length/2;
        // if(target == nums[mid]){
        //     return mid;
        // }
        // if(target > nums[mid]){
        //     for(int i=mid+1; i<nums.length; i++){
        //         if(nums[i] == target)
        //         index = i;
        //     }
        // }
        // for(int i=0; i<mid; i++){
        //     if(nums[i] == target){
        //         index = i;       
        //     }
        // }
        // return index;
    }
}