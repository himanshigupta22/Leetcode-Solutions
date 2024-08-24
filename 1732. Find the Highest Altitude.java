class Solution {
    public int largestAltitude(int[] gain) {
        int ans = 0;
        int altitude=0;

        for(int idx=0; idx<gain.length; idx++){
            altitude += gain[idx];
            if(altitude > ans) ans = altitude;
        }

        return ans;
    }
}
