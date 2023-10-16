class Solution {
    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int[] row = new int[n];
        int[] col = new int[m];

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(matrix[i][j] == 0){
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(matrix[i][j] != 0  && (row[i] == 1 || col[j] == 1)) {
                    matrix[i][j] = 0;
                }
            }
        }

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