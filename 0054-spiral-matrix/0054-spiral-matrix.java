class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> list = new ArrayList();

        int row = matrix.length;
        if(row == 0) return list;
        int col = matrix[0].length;

        int left=0 , right = col-1 , top=0 , bottom=row-1 , direct = 0;

        while (left<=right && top<=bottom){
            if(direct ==0){
                for(int i=left; i<= right; i++){
                    list.add(matrix[top][i]);
                }                
                direct=1;
                top++;
            }
            else if(direct == 1){
                for(int j=top; j<=bottom; j++){
                    list.add(matrix[j][right]);
                }
                direct=2;
                right--;
            }
            else if(direct == 2){
                for(int k=right; k>= left; k--){
                    list.add(matrix[bottom][k]);
                }
                direct=3;
                bottom--;
            }
            else if(direct == 3){
                for(int l=bottom; l>= top; l--){
                    list.add(matrix[l][left]);
                }
                direct=0;
                left++;
            }
        }
        return list;
        
    }
}