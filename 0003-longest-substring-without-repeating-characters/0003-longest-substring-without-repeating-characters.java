class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0,right=0;
        Set<Character> set = new HashSet();
        int max=0;
        while(right<s.length()){
            while(right<s.length() && !set.contains(s.charAt(right))){
                set.add(s.charAt(right));
                right++;
            }
            max = Math.max(max, right-left);
            set.remove(s.charAt(left));
            left++;
        }
        return max;
    }
}