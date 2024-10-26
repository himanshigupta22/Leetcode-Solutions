class Solution {
    public boolean checkIfPangram(String sentence) {
        if(sentence.length() < 26) return false;
        sentence.toLowerCase();
        int[] freq = new int[26];

        for(int idx = 0; idx < sentence.length(); idx++){
            freq[sentence.charAt(idx) - 'a']++;
        }

        for(int idx = 0; idx < 26; idx++){
            if(freq[idx] == 0){
                return false;
            }
            
        }
        return true;
    }
}
