class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0,right=0;
        Set<Character> found = new HashSet();
        int max=0;

        while(right<s.length()){
            char ch = s.charAt(right);
            if(found.add(ch)){
                max = Math.max(max,right-left+1);
                right++;
            }
            else{
                while(s.charAt(left) != ch){
                    found.remove(s.charAt(left));
                    left++;
                }
                found.remove(ch);
                left++;
            }
        }
        return max;
        
    }
}