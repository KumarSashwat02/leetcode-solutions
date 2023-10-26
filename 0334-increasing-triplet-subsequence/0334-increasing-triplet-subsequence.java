// class Solution {
//     public boolean increasingTriplet(int[] nums) {
//         if(nums == null || nums.length<3){
//             return false;
//         }
//         int i=0;
//         int j = nums.length;
//         while(i<j-2){
//             int k=i+1;
//             if(nums[i] < nums[k] && nums[k] < nums[k+1]){
//                 return true;
//             }
//             i=i+3;
//         }
//         return false;
//     }
// }
class Solution{
    public boolean increasingTriplet(int[] nums) {
        if (nums == null || nums.length < 3) {
            return false;
        }

        int first = nums[0];
        int second = Integer.MAX_VALUE;

        for (int third : nums) {
            if (third > second) {
                return true;
            } else if (third > first) {
                second = third;
            } else {
                first = third;
            }
        }
        return false;
    }
}