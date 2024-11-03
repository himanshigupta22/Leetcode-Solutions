class Solution {
    public int climbStairs(int n) {
        if(n == 1) return 1;
        if(n == 2) return 2;
        int f1 = 1;
        int f2 = 2;
        int fn = 0;

        for(int idx = 3; idx <= n; idx++){
            fn = f1 + f2;
            f1 = f2;
            f2 = fn;
        }

        return fn;
    }
}
