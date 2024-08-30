class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n = strs.length;
       StringBuilder ans = new StringBuilder();
       Arrays.sort(strs);
       String first = strs[0];
       String last = strs[n-1];
       int len = (Math.min(first.length(), last.length()));

       for(int idx=0; idx<len; idx++){
         if(first.charAt(idx) != last.charAt(idx))
         return ans.toString();

         ans.append(first.charAt(idx));
       }

        return ans.toString();
    }
}
