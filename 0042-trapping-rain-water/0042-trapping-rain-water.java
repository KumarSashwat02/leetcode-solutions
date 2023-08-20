class Solution {
    public int trap(int[] height) {
        int i = 0;
        int j = height.length-1;
        int lMax = height[0];
        int rMax = height[height.length-1];
        int store = 0;
        while(i!=j){
            if(lMax < rMax){
                i++;
                if(lMax < height[i]){
                    lMax = height[i];
                }else{
                int ans = lMax - height[i];
                    store += ans;
                }
            }
            else{
                j--;
                if(rMax < height[j]){
                    rMax = height[j];
                }
                else{
                int ans1 = rMax - height[j];
                    store += ans1;
                }
            }
        }
        return store;
    }
}