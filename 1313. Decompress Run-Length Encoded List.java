class Solution {
    public int[] decompressRLElist(int[] nums) {
        int n = nums.length;
        int size = 0;
        for(int idx = 0; idx < n; idx = idx+2){
           size += nums[idx];
        }
        int[] ans = new int[size];
        int index = 0;
        int freqIdx = 0, valIdx = 1;

        while(index < size){
            int freq = nums[freqIdx];
            int val = nums[valIdx];

            while(freq > 0){
                ans[index++] = val;
                freq --;
            }
            freqIdx += 2;
            valIdx += 2;
        }

        return ans;
    }
}
