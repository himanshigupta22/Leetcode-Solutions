class Solution {
    public double myPow(double x, int b) {
        if(x == 1) return 1;
        if(x == -1){
            if(b%2==0) return 1;
            else return -1;
        }
        long n = b;
        if(n<0){
            x = 1/x;
            n = -1*n;
        }
        double product = 1;
        for(int idx=1; idx<=n && product != 0; idx++){
            product *= x;
        }
        return product;
    }
}
