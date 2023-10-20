class Solution {
    public String reverseWords(String s) {
        Stack<String> st = new Stack<>();
        String s1 = "";
        StringBuilder ans = new StringBuilder();

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == ' '){
                if(s1.length()>0){
                    st.push(s1);
                    s1 = "";
                }
            }
            else{
                s1 = s1 + s.charAt(i);
            }
        }
        ans.append(s1);
        while(st.size()>0){
            ans.append(" ").append(st.pop());
        }
        return ans.toString().trim();
    }
}

