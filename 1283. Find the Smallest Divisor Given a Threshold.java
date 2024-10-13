class Solution {
    public int findMax(int[] arr){
        int max = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    public boolean possible(int[] nums, int threshold, int div){
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            double rem = (double)nums[i] / div;
            sum += Math.ceil(rem);
        }
        if(sum <= threshold) return true;
        return false;
    }

    public int smallestDivisor(int[] nums, int threshold) {
        int low = 1, high = findMax(nums);
        while(low <= high){
            int mid = (low + high) / 2;
            if(possible(nums, threshold, mid) == true){
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}
