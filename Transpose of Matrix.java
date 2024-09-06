class Solution
{
    public void transpose(int n,int a[][])
    {
        for(int row=0; row<n; row++){
            for(int col=row+1; col<n; col++){
                int temp = a[row][col];
                 a[row][col] = a[col][row];
                 a[col][row] = temp;
            }
        }
    }
}
