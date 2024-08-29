class Solution {
    public int firstMissingPositive(int[] nums) {

        int n = nums.length;

        for(int idx=0; idx<n; idx++){
           if(nums[idx] < 0 || nums[idx] > n)
            nums[idx] = 0;
        }

        // visited mark
        for(int idx=0; idx < n; idx++){
            int original = nums[idx] % (n+1);
            if(original > 0)
            nums[original-1] += (n+1);
        }

        for(int idx=0; idx<n; idx++) {
            int freq = nums[idx] / (n+1);
            if(freq == 0) return (idx+1);
        }
        return (n+1);
    }
}
