class Solution {
    public boolean isPowerOfFour(int n) {
        if(n==0 || n<0){
            return false;
        }
        if(n%2 == 0 || n==1){
           while(n%4 == 0){
            n = n/4;
        }
        return n==1; 
        }
        return false;
        
    }
}