class Solution {
    public int majorityElement(int[] nums) {
        int majority = 0, lead = 0;

        for(int val : nums){
            if(majority == val){
                lead++;
            } else if(lead == 0){
                majority = val;
                lead++;
            } else {
                lead--;
            }
        }
        return majority;
    }
}
