class Solution {
    public int firstUniqChar(String s) {
    
        int[] freq = new int[26];

        for(int ch : s.toCharArray()){
            freq[ch-'a']++;
        }
        for(int idx=0; idx < s.length(); idx++){
            if(freq[s.charAt(idx)-'a'] == 1) return idx;
        }
        return -1;
    }
}
