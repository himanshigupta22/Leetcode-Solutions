class Solution {
    public int maxProduct(int[] nums) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for(int idx = 0; idx < nums.length; idx++){
            if(nums[idx] > largest){
                secondLargest = largest;
                largest = nums[idx];
            } else if(nums[idx]>secondLargest){
                secondLargest = nums[idx];
            }

            if(nums[idx] < smallest){
                secondSmallest = smallest;
                smallest = nums[idx];
            } else if(nums[idx] < secondSmallest){
                secondSmallest = nums[idx];
            }
        }
        int product1 = (largest-1)*(secondLargest-1);
        int product2 = (smallest-1)*(secondSmallest-1);

        return Math.max(product1, product2);
    }
}
