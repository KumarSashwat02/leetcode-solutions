// class Solution {
//     public String longestPalindrome(String s) {
//         int l = 0, r=0;
//         Set<Character> set = new HashSet<>();
//         while(r<s.length()){
//             while(r<s.length && !set.contains(s.CharAt(r))){
//                 set.add(s.charAt(r));
//                 r++;
//             }
            
//         }
//     }
// }
class Solution {
    int start = 0; // Initialize the start index for the longest palindrome.
    int max = 0;   // Initialize the length of the longest palindrome.

    public String longestPalindrome(String s) {
        if(s.length() < 2)
            return s; 

        char[] chars = s.toCharArray();

        for(int i = 0; i < chars.length; i++){
            // Find odd length palindrome
            findPalindrome(chars, i, i); // current character as the center of the palindrome

            // Find even length palindrome
            findPalindrome(chars, i, i+1); // current character and the next character as the centers of the palindrome.
        }
        
        // Return the longest palindromic substring by using the start and max indices.
        return s.substring(start, start + max);
    }

    private void findPalindrome(char[] chars, int j, int k){
        // Expand the palindrome by checking characters at indices j and k.
        while( j >= 0 && k < chars.length && chars[j] == chars[k]){
            j--;
            k++;
        }
        
        // Check if the current palindrome length is greater than the previously recorded maximum.
        if(max < k - j - 1){
            max = k - j - 1;   // Update the length of the longest palindrome.
            start = j + 1;     // Update the start index of the longest palindrome.
        }
    }
}