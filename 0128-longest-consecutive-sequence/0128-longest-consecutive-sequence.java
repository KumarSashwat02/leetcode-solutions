// class Solution {
//     public int longestConsecutive(int[] nums) {
//         if(nums.length == 0){
//             return 0;
//         }
//         int count = 1;
//         int max = 1;
//         Arrays.sort(nums);
//         for(int i=0; i<nums.length-1; i++){
//             if(nums[i+1] - nums[i] == 1){
//                 count++;
//             }else{
//                 count = 1;
//             }
//             max = Math.max(max,count);
            
//         }
//         return max;
//     }
// }

class Solution {
    public int longestConsecutive(int[] a) {
        HashSet<Integer> h = new HashSet<>();
        int max=0,longest=0,ans=0;
        for(int i:a) h.add(i);
        for(int i:h){
            if(!h.contains(i-1)){
                max=1;
                longest=i;
                while(h.contains(longest+1)){
                    max+=1; longest+=1;
                }
            }
            ans=Math.max(ans,max);
        }
        return ans;
    }
}