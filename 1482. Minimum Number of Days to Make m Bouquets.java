class Solution {
    public int findMin(int[] arr){
        int min = arr[0];
        for(int idx = 1; idx < arr.length; idx++){
            if(arr[idx] < min){
                min = arr[idx];
            }
        }
        return min;
    }

    public int findMax(int[] arr){
        int max = arr[0];
        for(int idx = 1; idx < arr.length; idx++){
            if(arr[idx] > max){
                max = arr[idx];
            }
        }
        return max;
    }

    public boolean possible(int[] arr, int day, int m, int k){
        int count = 0, no_of_bouquet = 0;

        for(int idx = 0; idx < arr.length; idx++){
            if(arr[idx] <= day){
                count++;
            } else {
                no_of_bouquet += (count / k);
                count = 0;
            }
        }
        no_of_bouquet += (count / k);

        if(no_of_bouquet >= m) return true;
        return false;
    }

    public int minDays(int[] bloomDay, int m, int k) {
        long val = m * 1L * k;
        if(bloomDay.length < val) return -1;

        int low = findMin(bloomDay);
        int high = findMax(bloomDay);

        while(low <= high){
            int mid = (low + high) / 2;
            if(possible(bloomDay, mid, m, k) == true){
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}
