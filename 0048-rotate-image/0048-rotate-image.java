class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length; 
        int [][] ans = new int[n][n];
        int b = n-1;
        for(int i=0; i<n; i++){
            int a = 0;
            for(int j=0; j<n; j++){
                ans[a][b] = matrix[i][j];
                a++;
            }
            b--;
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                matrix[i][j] = ans[i][j];
            }
        }
    }
}