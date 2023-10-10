class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;
        HashSet<List<Integer>> ansSet = new HashSet<>();
        HashSet<Long> set = new HashSet<>();
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                for(int k=j+1; k<n; k++){
                    long sum = nums[i] + nums[j];
                    sum += nums[k];
                    long val = target -sum;
                    if(set.contains(val)){
                        List<Integer> l = new ArrayList<>();
                        l.add(nums[i]);
                        l.add(nums[j]);
                        l.add(nums[k]);
                        l.add((int)val);
                        Collections.sort(l);
                        ansSet.add(l);
                    }
                    else{
                        set.add((long)nums[k]);
                    }                    
                }
                set.clear();
            }
        }

        
        // HashSet<List<Integer>> set = new HashSet<>();
        // for(int i=0; i<n; i++){
        //     for(int j=i+1; j<n; j++){
        //         for(int k=j+1; k<n; k++){
        //             for(int m=k+1; m<n; m++){
        //                 if(nums[i] + nums[j] + nums[k] + nums[m] == target){
        //                     List<Integer> l = new ArrayList<>();
        //                     l.add(nums[i]);
        //                     l.add(nums[j]);
        //                     l.add(nums[k]);
        //                     l.add(nums[m]);
        //                     Collections.sort(l);
        //                     set.add(l);
        //                 }
        //             }
        //         }
        //     }
        // }
        List<List<Integer>> ans = new ArrayList<>(ansSet);
        return ans;
    }
}