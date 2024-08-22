class Solution {
    public int maxProduct(int[] nums) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;


        for(int idx = 0; idx < nums.length; idx++){
            if(nums[idx] > largest){
                secondLargest = largest;
                largest = nums[idx];
            } else if(nums[idx]>secondLargest){
                secondLargest = nums[idx];
            }

        }
        int product = (largest-1)*(secondLargest-1);
        
        return product;
    }
}
