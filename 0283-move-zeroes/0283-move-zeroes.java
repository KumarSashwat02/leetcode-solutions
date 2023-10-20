class Solution {
    public void moveZeroes(int[] nums) {
        int i=0;
        int j= nums.length;
        for(int num : nums){
            if(num !=0){
                nums[i] = num;
                i++;
            }
        }
        while(i<j){
            nums[i] = 0;
            i++;
        }
    }
}