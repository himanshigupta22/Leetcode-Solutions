class Solution {
    public String compressedString(String word) {
        StringBuilder comp = new StringBuilder();

        int left = 0, right = 0;
        while(left < word.length()){
            char ch = word.charAt(left);
            int freq = 0;

            while(right < word.length() && word.charAt(right) == ch){
                freq++; right++;
            }

            while(freq > 9){
                freq = freq - 9;
                comp.append(9);
                comp.append(ch);
            }
            comp.append(freq);
            comp.append(ch);
            left = right;
        }

        return comp.toString();
    }
}
