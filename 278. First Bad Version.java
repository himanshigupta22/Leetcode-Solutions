public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int left = 0, right = n-1;

        while(left <= right){
            int mid = left + (right-left)/2;

            if(isBadVersion(mid) == false){
                left = mid+1;
            } else {
                right = mid-1;
            }
        }
        return left;
    }
}
