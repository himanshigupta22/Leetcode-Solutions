class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        if(original.length != m*n) return new int[0][0];
        int[][] res = new int[m][n];

        for(int idx=0; idx < original.length; idx++){
            int row = idx / n;
            int col = idx % n;
            res[row][col] = original[idx];
        }
        return res;
    }
}
