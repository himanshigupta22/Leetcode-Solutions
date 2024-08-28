class Solution {
    public boolean isAnswer(int[] nums, int target){
        int n = nums.length;
        int freq = 0;

        for(int val : nums){
            if(target == val) freq++;
        }

        if(freq > n/3) return true;
        else return false;
    }
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<>();

        int majA = Integer.MIN_VALUE;
        int majB = Integer.MIN_VALUE;
        int leadA = 0, leadB = 0;

        for(int val : nums){
            if(val == majA){
                leadA++;
            } else if(val == majB){
                leadB++;
            } else if(leadA == 0){
                majA = val;
                leadA++;
            } else if(leadB == 0){
                majB = val;
                leadB++;
            } else {
                leadA--; leadB--;
            }
        }
 
        if(isAnswer(nums, majA) == true) ans.add(majA);
        if(isAnswer(nums, majB) == true) ans.add(majB);

        return ans;
    }
}
