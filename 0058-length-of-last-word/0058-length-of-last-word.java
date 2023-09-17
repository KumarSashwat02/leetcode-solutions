class Solution {
    public int lengthOfLastWord(String s) {
        int count = 0;
        int end = s.length()-1;
        while(end>=0 && s.charAt(end) == 32){
            end--;
        }
        for(int i=end; i>=0; i--){
            if(s.charAt(i) == 32){
                break;
            }
            else{
                count++;
            }
        }
        return count;
    }
}