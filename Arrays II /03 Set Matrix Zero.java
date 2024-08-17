problem link -> [ https://leetcode.com/problems/set-matrix-zeroes/ ]
TC -> O(N^2)
SC -> O(N)
class Solution {
    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int[] row  = new int[n];
        int[] col = new int[m];

        for(int i = 0; i<n; i++){
            for(int j =0; j<m; j++){
                if(matrix[i][j] == 0){
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                if(row[i]==1 || col[j]==1){
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
TC-O(N^2)
SC-O(1)
class Solution {
    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int col1 = 1;
        //int[] row  = matrix[...][0];
        //int[] col = new int[0][...];

        for(int i = 0; i<n; i++){
            for(int j =0; j<m; j++){
                if(matrix[i][j] == 0){
                    //mark i row
                    matrix[i][0] = 0;
                    //mark j col
                    if(j!=0){
                        matrix[0][j] = 0;
                    }
                    else{
                        col1 = 0;
                    }
                }
            }
        }
        for(int i = 1; i<n; i++){
            for(int j = 1; j<m; j++){
                if(matrix[i][j] != 0){
                if(matrix[i][0]==0 || matrix[0][j]==0){
                    matrix[i][j] = 0;
                }
            }
        }
    }
    if(matrix[0][0]==0){
        for(int j = 0; j<m; j++) matrix[0][j] = 0;
    }
    if(col1 == 0){
        for(int i = 0; i<n; i++) matrix[i][0] = 0;
    }
    }
}
