class Solution {
    public int floorIdx(int[] arr, int target){
        int left = 0;
        int right = arr.length - 1;

        while(left <= right){
            int mid = left + (right - left)/2;

            if(arr[mid] == target){
                right = mid - 1;
            } else if(arr[mid] < target){
                left = mid + 1;
            } else {
                right = mid -1;
            }
        }
        return right;
    }

    public int findClosest(int[] heaters, int target){
        int floor = floorIdx(heaters, target);
        int ceil = floor + 1;

        int floorDist = (floor == -1) ? Integer.MAX_VALUE : (target - heaters[floor]);
        int ceilDist = (ceil == heaters.length) ? Integer.MAX_VALUE : (heaters[ceil] - target);

        return Math.min(floorDist, ceilDist);
    }

    public int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(heaters);
        
        int minRadius = 0;
        for(int house : houses){
            int radius = findClosest(heaters, house);
            minRadius = Math.max(minRadius, radius);
        }
        return minRadius;
    }
}
