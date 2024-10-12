class Solution {
    int floorIdx(int[] arr, int target){
        int left = 0;
        int right = arr.length - 1;

        while(left <= right){
            int mid = left + (right - left) / 2;

            if(arr[mid] == target){
                right = mid - 1;
            } else if(arr[mid] < target){
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return right;
    }
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int floor = floorIdx(arr, x);
        int ceil = floor + 1;

        for(int i = 0; i < k; i++){
            int floorDist = (floor == -1) ? Integer.MAX_VALUE : (x - arr[floor]);
            int ceilDist = (ceil == arr.length) ? Integer.MAX_VALUE : (arr[ceil] - x);

            if(floorDist <= ceilDist){
                  floor--;
            } else {
                ceil++;
            }
        }

        List<Integer> ans = new ArrayList<>();
        for(int idx = floor+1; idx < ceil; idx++){
            ans.add(arr[idx]);
        }

        return ans;
    }
}
