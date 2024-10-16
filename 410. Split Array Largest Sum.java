class Solution {
    public int findSum(int[] arr){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }

    public int findMax(int[] arr){
        int max = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    public int splitFunc(int[] arr, int val){
        int count = 1, sum = 0;
        for(int idx = 0; idx < arr.length; idx++){
            if(sum + arr[idx] <= val){
                sum += arr[idx];
            } else {
                count++;
                sum = arr[idx];
            }
        }
        return count;
    }

    public int splitArray(int[] nums, int k) {
        int low = findMax(nums), high = findSum(nums);
        while(low <= high){
            int mid = (low + high) / 2;
            int no_of_split = splitFunc(nums, mid);
            if(no_of_split > k){
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
          
        return low;
    }
}
