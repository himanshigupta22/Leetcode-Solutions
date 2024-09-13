class Solution {
    private void reverse(int[] nums, int start, int end){
        while(start < end){
          swap(nums, start, end);
          start++; end--;
        }
    }
    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public void nextPermutation(int[] nums) {
        int idx = -1;
        int n = nums.length;
        for(int i = n-1; i > 0; i--){
            if(nums[i-1] < nums[i]) {
                idx = i-1;
                break;
            }
        }
        if(idx == -1){
            reverse(nums, idx+1, n-1);
            return;
        }
        for(int i=n-1; i > idx; i--){
            if(nums[i] > nums[idx]){
                swap(nums, i, idx);
                break;
            }
        }
        Arrays.sort(nums, idx+1, n);
    }
}
