class Solution {
    public int reverse(int x) {
        int rem = 0;
        int rev = 0;
        while(x!=0){
            rem = x%10;
            int newrev = rev*10 + rem;
            if(newrev/10 != rev) return 0;
            rev = newrev;
            x/=10;
        }
        return rev;

    }
}
