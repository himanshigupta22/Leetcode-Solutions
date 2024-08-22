class Solution {
    public int[] searchRange(int[] arr, int x) {
        
        int firstOcc = -1;
        int lastOcc = -1;
        int n = arr.length;

        // first occurence
        int low = 0;
        int high = n-1;
        
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid] == x){
                firstOcc = mid;
                high = mid-1;
            } else if(arr[mid] > x){
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        
        
        // last occurence
        low = 0;
        high = n-1;
        
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid] == x){
                lastOcc = mid;
                low = mid + 1;
            } else if(arr[mid] > x){
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        
        int[] res = {firstOcc, lastOcc};
        return res;
    }
}
