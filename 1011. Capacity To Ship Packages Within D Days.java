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
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    public int findDays(int[] weights, int capacity){
        int days = 1, load = 0;
        for(int idx = 0; idx < weights.length; idx++){
            if(load + weights[idx] > capacity){
                days++;
                load = weights[idx];
            } else {
                load += weights[idx];
            }
        }
        return days;
    }

    public int shipWithinDays(int[] weights, int days) {
        int low = findMax(weights), high = findSum(weights);
       
        while(low <= high){
            int mid = (low + high) / 2;
            int numOfDays = findDays(weights, mid);
            if(numOfDays <= days) 
                high = mid - 1;
            else 
                low = mid + 1;
            
        }
        return low;
    }
}
