class Solution {
    public String reverseWords(String s) {
        StringBuilder res = new StringBuilder();
        StringBuilder temp = new StringBuilder();

        for (int i = 0; i < s.length(); ++i) {
            while (i < s.length() && s.charAt(i) != ' ') {
                temp.append(s.charAt(i));
                ++i;
            }

            if (temp.length() != 0) {
                // If we find a word we will add it at beginning of result.
                if (res.length() != 0) {
                    res.insert(0, " ");
                    res.insert(0, temp);
                } else {
                    res.append(temp);
                }
                temp.setLength(0);
            }
        }
        return res.toString();





    //     Stack<String> st = new Stack<>();
    //     String s1 = "";
    //     StringBuilder ans = new StringBuilder();

    //     for(int i=0; i<s.length(); i++){
    //         if(s.charAt(i) == ' '){
    //             if(s1.length()>0){
    //                 st.push(s1);
    //                 s1 = "";
    //             }
    //         }
    //         else{
    //             s1 = s1 + s.charAt(i);
    //         }
    //     }
    //     ans.append(s1);
    //     while(st.size()>0){
    //         ans.append(" ").append(st.pop());
    //     }
    //     return ans.toString().trim();
    }
}

