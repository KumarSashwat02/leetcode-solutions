class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);
        for(int i=0; i<n; i++){
            if(i>0 && nums[i] == nums[i-1])continue;
            for(int j=i+1; j<n; j++){
                if(j>i+1 && nums[j] == nums[j-1])continue;
                int k = j+1;
                int l = n-1;
                while(k<l){
                    long sum = nums[i];
                    sum += nums[j];
                    sum += nums[k];
                    sum += nums[l];
                    if( sum < target){
                        k++;
                    }
                    else if(sum > target){
                        l--;
                    }
                    else{
                        List<Integer> l1 = new ArrayList<>();
                        l1.add(nums[i]);
                        l1.add(nums[j]);
                        l1.add(nums[k]);
                        l1.add(nums[l]);
                        ans.add(l1);
                        k++;
                        l--;
                    while(k<l && nums[k] == nums[k-1]){
                        k++;
                    }
                    while(k<l && nums[l] == nums[l+1] ){
                        l--;
                    }
                    }
                }
            }
        }
        return ans;





        // HashSet<List<Integer>> ansSet = new HashSet<>();
        // HashSet<Long> set = new HashSet<>();
        // for(int i=0; i<n; i++){
        //     for(int j=i+1; j<n; j++){
        //         for(int k=j+1; k<n; k++){
        //             long sum = nums[i] + nums[j];
        //             sum += nums[k];
        //             long val = target -sum;
        //             if(set.contains(val)){
        //                 List<Integer> l = new ArrayList<>();
        //                 l.add(nums[i]);
        //                 l.add(nums[j]);
        //                 l.add(nums[k]);
        //                 l.add((int)val);
        //                 Collections.sort(l);
        //                 ansSet.add(l);
        //             }
        //             else{
        //                 set.add((long)nums[k]);
        //             }                    
        //         }
        //         set.clear();
        //     }
        // }
        // List<List<Integer>> ans = new ArrayList<>(ansSet);
        // return ans;

        
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
        // List<List<Integer>> ans = new ArrayList<>(set);
        // return ans;
    }
}