class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        int n = nums.length;
        for(int i=0; i<n; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
            if(map.get(nums[i]) > n/3){
                set.add(nums[i]);
            }
        }
        ArrayList<Integer> ans = new ArrayList<>(set);
        return ans;
    }
}