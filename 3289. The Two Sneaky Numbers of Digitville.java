class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[] freq = new int[nums.length];
        int[] res = new int[2];

        for(int idx = 0; idx < nums.length; idx++){
            freq[nums[idx]]++;
            if(freq[nums[idx]] > 1){
                if(res[0] == 0)
                res[0] = nums[idx];
                else res[1] = nums[idx];
            }
        }
        return res;
    }
}
