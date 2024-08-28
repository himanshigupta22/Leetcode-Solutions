class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        
        // visited mark
        for(int idx=0; idx<n; idx++){
            int original = nums[idx] % (n+1);
            if(original < n){
                nums[original] += (n+1);
            }
        }

        // finding duplicate one
        for(int idx=0; idx<n; idx++){
            int freq = nums[idx] / (n+1);
            if(freq >= 2) return idx;
        }
        return n;
    }
}
