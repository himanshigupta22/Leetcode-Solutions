class Solution {
    public String addStrings(String num1, String num2) {
        int idx1 = num1.length()-1;
        int idx2 = num2.length()-1;
        int carry = 0;

        StringBuilder res = new StringBuilder();
        while(idx1 >= 0 || idx2 >= 0 || carry > 0) {
            int d1 = (idx1 >= 0) ?  num1.charAt(idx1) -'0' : 0;
            int d2 = (idx2 >= 0) ?  num2.charAt(idx2)-'0' : 0;
            int sum = d1 + d2 + carry;
            
            res.append(sum%10);
            carry = sum / 10;
            idx1--; idx2--;
        }
        return res.reverse().toString();
    }
}
