class Solution {
    public String reverseWords(String str) {
       StringBuilder res = new StringBuilder();
       int n = str.length();
       int right = n-1;
       while(right >= 0){
        while(right >= 0 && str.charAt(right) == ' '){
            right--;
        }
        int left = right;
        while(left >= 0 && str.charAt(left) != ' '){
            left--;
        }
        if(res.length() > 0 && left < right){
            res.append(" ");
        }

        for(int idx=left+1; idx <= right; idx++){
             res.append(str.charAt(idx));
        }
          right = left;
       }
       return res.toString();
    }
}
