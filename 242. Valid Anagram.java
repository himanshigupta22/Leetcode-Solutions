class Solution {
    public int[] getFrequency(String str){
       int[] freq = new int[26];

       for(char ch : str.toCharArray()){
          freq[ch-'a']++;
       }
       return freq;
    }

    public boolean isAnagram(String s, String t) {
       if(s.length() != t.length()) return false;

       int[] freq1 = getFrequency(s);
       int[] freq2 = getFrequency(t);

       for(int idx=0; idx < 26; idx++){
        if(freq1[idx] != freq2[idx]) return false;
       }
       
       return true;
    }
}
