class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        for(int row=0; row < m; row++){
            int minNum = matrix[row][0];
            int minIdx = 0;
            for(int col=0; col<n; col++){
                if(matrix[row][col] < minNum){
                    minNum = matrix[row][col];
                    minIdx = col;
                }
            }
            int maxNum = 0;
            for(int r=0; r < m; r++){
                if(matrix[r][minIdx] > maxNum){
                    maxNum = matrix[r][minIdx];
                }
            }
            if(minNum == maxNum){
                List<Integer> res = new ArrayList<>();
                res.add(maxNum);
                return res;
            }
        }
        return new ArrayList<>();
    }
}
