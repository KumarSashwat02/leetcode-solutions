class Solution {
    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        
// Optimal Solution and doing it inplace
        boolean fr = false, fc = false;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(matrix[i][j] == 0){
                    if(i == 0) fr = true;
                    if(j == 0) fc = true;
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }
        for(int i=1; i<n; i++){
            for(int j=1; j<m; j++){
                if(matrix[0][j] == 0 || matrix[i][0] == 0){
                    matrix[i][j] = 0;
                }
            }
        }
        if(fr){
            for(int j=0; j<m; j++ ){
                matrix[0][j] = 0;
            }
        }
        if(fc){
            for(int i=0; i<n; i++){
                matrix[i][0] = 0;
            }
        }



//Better Solution but it will increase the space complexity
        // int[] row = new int[n];
        // int[] col = new int[m];

        // for(int i=0; i<n; i++){
        //     for(int j=0; j<m; j++){
        //         if(matrix[i][j] == 0){
        //             row[i] = 1;
        //             col[j] = 1;
        //         }
        //     }
        // }
        // for(int i=0; i<n; i++){
        //     for(int j=0; j<m; j++){
        //         if(matrix[i][j] != 0  && (row[i] == 1 || col[j] == 1)) {
        //             matrix[i][j] = 0;
        //         }
        //     }
        // }





// Brute Force Solution but it will have a TC : (n*m)(n+m)+(n*m)
        // for(int i=0; i<n; i++){
        //     for(int j=0; j<m; j++){
        //         if(matrix[i][j] == 0){
        //             markRow(matrix, i);
        //             markCol(matrix, j);
        //         }
        //     }
        // }
        // for(int i=0; i<n; i++){
        //     for(int j=0; j<m; j++){
        //         if(matrix[i][j] == -1){
        //             matrix[i][j] = 0;
        //         }
        //     }
        // }    
    }
    // public void markRow(int[][] matrix, int row){
    //     int m = matrix[row].length;
    //     for(int j=0; j<m; j++){
    //         if(matrix[row][j] != 0){
    //             matrix[row][j] = -1;
    //         }
    //     }
    // }
    // public void markCol(int[][] matrix, int col){
    //     int n = matrix.length;
    //     for(int i=0; i<n; i++){
    //         if(matrix[i][col] != 0){
    //             matrix[i][col] = -1;
    //         }
    //     }
    // }

}