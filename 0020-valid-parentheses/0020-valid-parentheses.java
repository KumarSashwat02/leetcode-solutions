class Solution {
    public boolean isMatch(char a, char b){
        if(a == '[' && b == ']'){
            return true;
        }
        else if(a == '{' && b == '}'){
            return true;
        }
        return a == '(' && b == ')';
    }
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        if(s.length()%2!=0){
            return false;
        }
        for(int i=0; i<s.length();i++){
            if(s.charAt(i) =='[' || s.charAt(i) == '{' || s.charAt(i) == '(' ){
                stack.push(s.charAt(i));
            }
            else{
                if(stack.empty()){
                    return false;
                }
                char ch = stack.peek();
                if(!isMatch(ch, s.charAt(i))){
                    return false;
                }
                stack.pop();
            }
        }
        return stack.empty();
    }
}