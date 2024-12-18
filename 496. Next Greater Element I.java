class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> mpp = new HashMap<>();
        Stack<Integer> st = new Stack<>();

        for(int i = nums2.length-1; i >= 0; i--){
            if(st.size() == 0){
                mpp.put(nums2[i], -1);
            } else if(st.size() > 0 && st.peek() > nums2[i]){
                mpp.put(nums2[i], st.peek());
            } else if(st.size() > 0 && st.peek() <= nums2[i]){

                while(st.size() > 0 && st.peek() <= nums2[i]){
                    st.pop();
                } 
                if(st.isEmpty()){
                    mpp.put(nums2[i], -1);
                } else {
                    mpp.put(nums2[i], st.peek());
                }
            }
            st.push(nums2[i]);
        }
    
        int[] ans = new int[nums1.length];
        for(int i = 0; i < nums1.length; i++){
            ans[i] = mpp.get(nums1[i]);
        }
        
        return ans;
    }
}
