class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        
        for(int d = 1-n; d <= m-1; d++){
            int row = (d <= 0) ? 0 : d;
            int col = (d <= 0) ? -d : 0;
            int val = matrix[row][col];
            while(row < m && col < n){
                if(val != matrix[row][col]) return false;
                row++; col++;
            }
        }
        return true;
    }
}
