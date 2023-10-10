class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0; i<n; i++){
            if(i>0 && nums[i] == nums[i-1])continue;
            int j = i+1;
            int k = n-1;
            while(j<k){
                int sum = nums[i] + nums[j] + nums[k];
                if(sum < 0){
                    j++;
                }
                else if(sum > 0){
                    k--;
                }
                else{
                    List<Integer> l = new ArrayList<>();
                    l.add(nums[i]);
                    l.add(nums[j]);
                    l.add(nums[k]);
                    ans.add(l);
                    j++;
                    k--;
                    while(j<k && nums[j] == nums[j-1]){
                        j++;
                    }
                    while(j<k && nums[k] == nums[k+1]){
                        k--;
                    }
                }
            }
        }
        return ans;









// better way but not much optmised
        // HashSet<List<Integer>> ansSet = new HashSet<>();
        // int n = nums.length;
        // HashSet<Integer> set = new HashSet<>();
        // for(int i=0; i<n; i++){
        //     for(int j=i+1; j<n; j++){
        //         int k = -(nums[i] + nums[j]);
        //         if(set.contains(k)){
        //             List<Integer> l = new ArrayList<>();
        //             l.add(nums[i]);
        //             l.add(nums[j]);
        //             l.add(k);
        //             Collections.sort(l);
        //             ansSet.add(l);
        //         }
        //         else{
        //             set.add(nums[j]);
        //         }
        //     }
        //     set.clear();
        // }
        // List<List<Integer>> ans = new ArrayList<>(ansSet);
        // return ans;







// BRUTE FORCE METHOD (WILL GIVE TLE)   
        // HashSet<List<Integer>> set = new HashSet<>();
        // int n = nums.length;
        // for(int i=0; i<n; i++){
        //     for(int j=i+1; j<n; j++){
        //         for(int k=j+1; k<n; k++){
        //             if(nums[i]+nums[j]+nums[k] == 0){
        //                 List<Integer> l = new ArrayList<>();
        //                 l.add(nums[i]);
        //                 l.add(nums[j]);
        //                 l.add(nums[k]);
        //                 Collections.sort(l);
        //                 set.add(l);
        //             }
        //         }
        //     }
        // }
        // List<List<Integer>> ans = new ArrayList<>(set);
        // return ans;
    }
}