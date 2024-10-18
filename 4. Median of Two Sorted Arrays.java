class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int left = 0, right = 0;
        int n1 = nums1.length, n2 = nums2.length;
        int n = n1 + n2, count = 0;
        int ind2 = n/2;
        int ind1 = ind2 - 1;
        int ele1 = -1, ele2 = -1;

        while(left < n1 && right < n2){
            if(nums1[left] <= nums2[right]){
                if(count == ind1) ele1 = nums1[left];
                if(count == ind2) ele2 = nums1[left];
                left++;
                count++;
            } else {
                if(count == ind1) ele1 = nums2[right];
                if(count == ind2) ele2 = nums2[right];
                right++;
                count++;
            }
           
        }

        while(left < n1){
            if(count == ind1) ele1 = nums1[left];
            if(count == ind2) ele2 = nums1[left];
            left++; count++;
        }
        while(right < n2){
            if(count == ind1) ele1 = nums2[right];
            if(count == ind2) ele2 = nums2[right];
            right++; count++;
        }
        
        if(n % 2 == 0) return (double)(ele1 + ele2) / 2;
        return ele2;
        
    }
}
