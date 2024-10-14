class Solution {
    public int[] runningSum(int[] nums) {
        int[] runningSum = new int[nums.length];

        for(int i=0; i<nums.length; i++){
            runningSum[i] = nums[i] + ((i > 0) ? runningSum[i-1] : 0);
        }

        return runningSum;
    }
}
