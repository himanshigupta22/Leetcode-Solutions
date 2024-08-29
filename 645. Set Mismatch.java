class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] ans = new int[2];
        int n = nums.length;

        // visited mark
        for(int idx=0; idx<n; idx++){
            int original = nums[idx] % (n+1);
            nums[original-1] += (n+1);
        }

        // finding that appears twice
        for(int idx=0; idx<n; idx++){
           int freq = nums[idx] / (n+1);
           if(freq == 2) {
              ans[0] = idx+1;
           } else if(freq == 0){
              ans[1] = idx+1;
           }
        }
        
        return ans;
    }
}
