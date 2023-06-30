class Solution {
    public int strStr(String haystack, String needle) {
        // Stack<Character> stack = new Stack<>();
        // Stack<Character> stack1 = new Stack<>();
        // for(int i=0; i<needle.length(); i++){
        //     stack.push(needle.charAt(i));
        // }
        // for(int i=0; i<haystack.length(); i++){
        //     stack1.push(haystack.charAt(i));
        // }
        int index = 0;
        
        // if(stack.empty()){
        //     return -1;
        // }
        // while(!stack.empty()){
        //     if(stack1.peek() == stack.peek()){
        //         stack.pop();
        //         stack1.pop();
        //         result++;
        //     }
        //     stack1.pop();
        // }
        for(int i=0; i<haystack.length(); i++){
            if(haystack.charAt(i) == needle.charAt(index)){
                index++;
            }
            else{
                i = i-index;
                index = 0;
            }
            if(index == needle.length()){
            return i-index+1;
        }
        }
        
        return -1;
    }
}