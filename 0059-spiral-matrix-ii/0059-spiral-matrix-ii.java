class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int l=0,r=n-1,b=n-1,t=0,d=0,value=1;
        while(l<=n && t<=n){
            if(d==0){
                for(int i=l; i<=r; i++){
                    if(value<=n*n){
                        matrix[t][i] = value;
                        value++;
                    }
                }
                t++;
                d=1;
            }
            else if(d==1){
                for(int i=t; i<=b; i++){
                    if(value<n*n){
                        matrix[i][r] = value;
                        value++;
                    }
                }
                r--;
                d=2;
            }
            else if(d==2){
                for(int i=r; i>=l; i--){
                    if(value<=n*n){
                        matrix[b][i] =value;
                        value++;
                    }
                }
                b--;
                d=3;
            }
            else if(d==3){
                for(int i=b; i>=t; i--){
                    if(value<=n*n){
                        matrix[i][l]=value;
                        value++;
                    }
                }
                l++;
                d=0;
            }
        }    
        return matrix;    
    }
}