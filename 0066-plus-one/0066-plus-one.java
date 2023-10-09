class Solution {
    public int[] plusOne(int[] digits) {
        // int num = 0;
        // for(int i=0; i<digits.length; i++){
        //     num = num * 10;
        //     num = num + digits[i];
        // }
        // num = num+1;
        // if(digits[digits.length-1] == 9 || digits[0] == 9){
        //     int[] ans = new int[digits.length+1];
        // }
        // int[] ans = new int[digits.length];
        // int j=ans.length-1;
        // while(num != 0 && j>0){
        //     int val = num%10;
        //     ans[j] = val;
        //     num/=10;
        //     j--;
        // }
        // ans[0] = num;
        // return ans;
        // if(digits.length==1 && digits[digits.length-1]==9){
        //     int[] ans = new int[2];
        //     ans[0] = 1;
        //     ans[1] = 0;
        //     return ans;
        // }
        // digits[digits.length-1] = digits[digits.length-1]+1;
        // return digits;
        for (int i = digits.length - 1; i >= 0; i--) {
	        if (digits[i] == 9){
		        digits[i] = 0;
	        }
            else{
	            digits[i]++;
                return digits;
            }
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
}