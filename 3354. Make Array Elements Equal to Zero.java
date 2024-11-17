class Solution {
    public int countValidSelections(int[] nums) {
        int valid = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                // Check both directions
                if (canMakeAllZero(nums.clone(), i, -1)) { // Left direction
                    valid++;
                }
                if (canMakeAllZero(nums.clone(), i, 1)) { // Right direction
                    valid++;
                }
            }
        }
        
        return valid;
    }

    private boolean canMakeAllZero(int[] nums, int start, int direction) {
        int n = nums.length;
        int curr = start;

        while (true) {
            if (curr < 0 || curr >= n) {
                break; // Out of bounds
            }

            if (nums[curr] == 0) {
                // Move in the current direction
                curr += direction;
            } else {
                // Decrement and reverse direction
                nums[curr]--;
                direction = -direction;
                curr += direction;
            }
        }

        // Check if all elements are zero
        for (int num : nums) {
            if (num != 0) {
                return false;
            }
        }
        return true;
    }
}
