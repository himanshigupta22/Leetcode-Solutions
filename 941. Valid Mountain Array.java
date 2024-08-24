class Solution {
    public boolean validMountainArray(int[] arr) {
        if(arr.length < 3) return false;
        int n = arr.length;
        int idx=0;
        // Increasing mountain
        while(idx < n-1){
            if(arr[idx] == arr[idx+1]){
                return false;
            } else if(arr[idx] > arr[idx+1]){
                break;
            }
            idx++;
        }
        if(idx == 0 || idx == n-1){
            return false;
        }
        // Decreasing mountain
        while(idx < n-1){
            if(arr[idx] <= arr[idx+1])
            return false;
            idx++;
        }
        return true;
    }
}
