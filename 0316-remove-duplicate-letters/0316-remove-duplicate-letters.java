// class Solution {
//     public String removeDuplicateLetters(String s) {
//         HashSet<Character> set = new HashSet<>();
//         for(int i=0; i<s.length(); i++){
//             set.add(s.charAt(i));
//         }
//         String s1 = "";
//         for(Character c : set){
//             s1 = s1+c;
//         }
//         char[] ans = s1.toCharArray();
//         Arrays.sort(ans);
//         return new String(ans);
//     }
// }

public class Solution {
    public String removeDuplicateLetters(String s) {
        Stack<Character> stack = new Stack<>();
        Set<Character> seen = new HashSet<>();
        Map<Character, Integer> lastOcc = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            lastOcc.put(s.charAt(i), i);
        }
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!seen.contains(c)) {
                while (!stack.isEmpty() && c < stack.peek() && i < lastOcc.get(stack.peek())) {
                    seen.remove(stack.pop());
                }
                seen.add(c);
                stack.push(c);
            }
        }
        
        StringBuilder result = new StringBuilder();
        for (char c : stack) {
            result.append(c);
        }
        return result.toString();
    }
}