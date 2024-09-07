class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;

        for(int row=0; row<n; row++){
            for(int col=row+1; col<n; col++){
                int temp = matrix[row][col];
                matrix[row][col] = matrix[col][row];
                matrix[col][row] = temp;
            }
        }
        int left=0, right=n-1;

        while(left < right){
            for(int row=0; row<n; row++){
                int temp = matrix[row][left];
                matrix[row][left] = matrix[row][right];
                matrix[row][right] = temp;
            }
            left++; right--;
        }
    }
}
