class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int count = 0;
        for(int i=0; i<s.length(); i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1);
            if(map.get(s.charAt(i)) % 2 !=0){
                count++;
            }
            else{
                count--;
            }
        }
        if(count > 1){
            return s.length() - count + 1 ;
        }
        return s.length();
    }
}