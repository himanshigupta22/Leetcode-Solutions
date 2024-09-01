class Solution {
    public int[] plusOne(int[] digits) {
        for(int idx=digits.length-1; idx>=0; idx--){
            if(digits[idx] == 9){
                digits[idx] = 0;
            } else {
                digits[idx] += 1;
                return digits;
            }
        }
        int[] res = new int[digits.length+1];
        res[0] = 1;

        return res;
    }
}
