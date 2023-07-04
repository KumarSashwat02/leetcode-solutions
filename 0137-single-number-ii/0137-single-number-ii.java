class Solution {
     public int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
//        First loop to add elements to the hashmap. The getOrDefault() function in java checks if
//        the map already contains the given key. If it does, it returns it value, else it returns the default value.

        for (int num : nums)
            map.put(num, map.getOrDefault(num, 0) + 1);
			
//        Second loop to find the single element. The single element will have a value of 1 in the hashmap.
        for (int num : nums) {
            if (map.get(num) == 1)
                return num;
        }
		
        return -1;
    }
}
	