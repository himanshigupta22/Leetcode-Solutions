class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        int fr = 0, lr = matrix.length - 1;
        int fc = 0, lc = matrix[0].length - 1;

        while(true){
            // top wall
            for(int c = fc; c <= lc; c++){
               res.add(matrix[fr][c]);
            }
            fr++;
            if(fr > lr) break;
            // right wall
            for(int r = fr; r <= lr; r++){
                res.add(matrix[r][lc]);
            }
            lc--;
            if(fc > lc) break;

            // bottom wall
            for(int c = lc; c >= fc; c--){
                res.add(matrix[lr][c]);
            }
            lr--;
            if(fr > lr) break;

            // left wall
            for(int r = lr; r >= fr; r--){
               res.add(matrix[r][fc]);
            }
            fc++;
            if(fc > lc) break;

        }
        return res;
    }
}
