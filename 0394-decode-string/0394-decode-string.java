class Solution {
    public String decodeString(String s) {
        Stack<Integer> numStack = new Stack<>();
        Stack<String> strStack = new Stack<>();
        StringBuilder str = new StringBuilder();

        int len = s.length();
        for (int i = 0; i < len; i++) {

            char ch = s.charAt(i); //
            
            if (Character.isDigit(ch)) {
                //only numbers will come //eg. 3 //eg. 2
                // convert the single digit char into Int
                int num = ch - '0';

                //the below loop will only run when there is 
                //more than two digit number's present
                //eg. 23[b]345[v] ;
                while (i + 1 < len && Character.isDigit(s.charAt(i + 1))) {
                    num = num * 10 + s.charAt(i + 1) - '0';
                    i++; //
                }
                
                numStack.push(num);
                
            } else if (ch == '[') {
                // if not digit nor character then add it as a StringBuilder
                strStack.push(str.toString());
                str = new StringBuilder();

            } else if (ch == ']') {
                //before closing bracket we have to print all characters
                int k = numStack.pop(); //eg. 3 //eg. 2
                StringBuilder tmp = new StringBuilder(strStack.pop()); //eg. a //eg. bc
                for (int j = 0; j < k; j++) {
                    tmp.append(str);  //aaa   //bcbc
                }
                str = tmp; //aaa  //aaabcbc 

            } else {
                // one character at a time  
                str.append(ch); //eg. a, b, c
            }
        }
        return str.toString(); //convert StringBuilder to String
    }
}