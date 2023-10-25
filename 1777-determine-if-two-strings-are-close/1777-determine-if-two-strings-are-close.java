class Solution {
    public boolean closeStrings(String word1, String word2) {
        int w1 = word1.length();
        int w2 = word2.length();
        if(w1 != w2){
            return false;
        }
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        for(int i=0; i<w1; i++){
            map1.put(word1.charAt(i), map1.getOrDefault(word1.charAt(i),0)+1);
        }
        for(int i=0; i<w2; i++){
            if(map1.containsKey(word2.charAt(i))){
                map2.put(word2.charAt(i), map2.getOrDefault(word2.charAt(i),0)+1);
            }
            else{
                return false;
            }
        }
        ArrayList<Integer> l1 = new ArrayList<>(map1.values());
        ArrayList<Integer> l2 = new ArrayList<>(map2.values());
        Collections.sort(l1);
        Collections.sort(l2);
        // int sum = 0;
        // for(Character c : map.keySet()){
        //     sum += map.get(c);
        // }
        // return sum==0;
        return l1.equals(l2);
    }
}