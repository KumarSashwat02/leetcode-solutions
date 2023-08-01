class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,-1);
        int sum = 0;
        for(int j=0; j<nums.length; j++){
            sum += nums[j];
            if(k!=0){
                sum %= k;
            }
            if(map.containsKey(sum)){
                if(j-map.get(sum) > 1){
                    return true;
                }
            }
            else{
                map.put(sum,j);
            }
        }
        return false;
    }
}