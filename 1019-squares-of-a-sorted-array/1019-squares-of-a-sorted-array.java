class Solution {
    public int[] sortedSquares(int[] nums) {
        int i= 0;
        int k = 0;
        int ans[] = new int[nums.length];
        while(i<nums.length){
            ans[k] = nums[i]*nums[i];
            i++;
            k++;
        }
        Arrays.sort(ans);
        return ans;
    }
}