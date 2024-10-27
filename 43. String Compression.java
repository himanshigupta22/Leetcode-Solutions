class Solution {
    public int compress(char[] chars) {
        int newLength = 0;
        int left = 0, right = 0;
        while(left < chars.length){
            char ch = chars[left];
            int freq = 0;

            while(right < chars.length && chars[right] == ch){
                freq++; right++;
            }

            chars[newLength++] = ch;
            if(freq > 1) {
                for(char c : Integer.toString(freq).toCharArray()){
                    chars[newLength++] = c;
                }
            }
            left = right;
        }
        return newLength;
    }
}
