class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
       
        int m = mat.length;
        int n = mat[0].length;

        if(m * n != r * c){
            return mat;
        }

        int[][] reshaped = new int[r][c];

        for(int k=0; k<m*n; k++){
           
            int originalRow = k / n;
            int originalColumn = k % n;

            int newRow = k / c;
            int newColumn = k % c;

            reshaped[newRow][newColumn] = mat[originalRow][originalColumn];
        } 
        
        // step 5 - return reshaped matrix `reshaped`
        return reshaped;
    }
}
