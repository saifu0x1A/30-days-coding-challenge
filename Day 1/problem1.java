class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        boolean[] forRows= new boolean[m];
        boolean[] forCols= new boolean[n];

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(matrix[i][j] == 0){
                    forRows[i] = true;
                    forCols[j] = true;
                }
            }
        }
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(forRows[i] || forCols[j]){
                    matrix[i][j] = 0;
                }
            }
        }
    }
}