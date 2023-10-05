class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1 || numRows>= s.length()){
            return s;
        }
        String ans = "";
        for(int i=0 ; i<numRows; i++){
            int jump = (numRows-1)*2;
            for(int j = i; j<s.length(); j+=jump){
                ans = ans+s.charAt(j);
                if(i>0 && i<numRows-1 && j+jump-2*i < s.length()){
                    ans = ans + s.charAt(j+jump-2*i);
                }
            }
        }
        return ans;
    }
}