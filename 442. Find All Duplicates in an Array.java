class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int n = nums.length;

        // visited mark
        for(int idx=0; idx<n; idx++){
            int original = nums[idx] % (n+1);
            nums[original-1] += (n+1);
        }

        // finding that appears twice
        for(int idx=0; idx<n; idx++){
           int freq = nums[idx] / (n+1);
           if(freq == 2) ans.add(idx+1);
        }
        
        return ans;
        
    }
}
