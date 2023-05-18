class Solution {

int dp[][] = new int[505][505];
public int rec(int[] nums1, int[] nums2,int n,int m){
    if(n<0 || m<0){
        return 0;
    }

    if(dp[n][m] != -1){
        return dp[n][m];
    }

    if(nums1[n] == nums2[m]){
        return dp[n][m] = 1 + rec(nums1,nums2,n-1,m-1);
    } else {
        return dp[n][m] = Math.max(rec(nums1,nums2,n,m-1),rec(nums1,nums2,n-1,m));
    }
    
}
public int maxUncrossedLines(int[] nums1, int[] nums2) {

    for(int i=0;i<nums1.length;i++){
        for(int j=0;j<nums2.length;j++){
            dp[i][j] = -1;
        }
    }


    int n = nums1.length-1;
    int m = nums2.length-1;
    return rec(nums1,nums2,n,m);
}
}