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

    public int findTotalHrs(int[] piles, int hrs){
        int totalHrs = 0;
        for(int i = 0; i < piles.length; i++){
            totalHrs += Math.ceil((double)piles[i] / hrs);
        }
        return totalHrs;
    }

    public int minEatingSpeed(int[] piles, int h) {
        int low = 1, high = findMax(piles);

        while(low <= high){
            int mid = (low + high) / 2;
            int totalHrs = findTotalHrs(piles, mid);
            
            if(totalHrs <= h){
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}
