class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> ans = new ArrayList<>();
        long n = 1;
        ans.add((int)n);
        for(int i = 1; i<rowIndex+1 ; i++){
            n = n*((rowIndex+1) - i);
            n = n/i;
            ans.add((int)n);
        }
        return ans;
    }
}