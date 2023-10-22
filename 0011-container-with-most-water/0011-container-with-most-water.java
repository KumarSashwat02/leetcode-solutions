class Solution {
    public int maxArea(int[] height) {
        int res = 0;
        int i = 0;
        int j = height.length - 1;
        int min_height = 0;

        while (j!= i){
            if(height[i] < height[j]){
                min_height = height[i];
            } 
            else{
                min_height = height[j];
            }
            if(min_height *(j-i) > res){
                res = min_height *(j-i);
            }

            if(height[i] < height[j]){
                i++;
            }
            else{
                j--;
            }
        }
        return res;
    }
}