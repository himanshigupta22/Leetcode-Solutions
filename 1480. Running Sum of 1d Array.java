class Solution {
    public int[] runningSum(int[] nums) {
        int[] runningSum = new int[nums.length];

        for(int idx=0; idx<nums.length; idx++){
            runningSum[idx] = nums[idx] + ((idx > 0) ? runningSum[idx-1] : 0);
        }

        return runningSum;
    }
}
