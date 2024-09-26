// Time Complexity : O(n^2) where n is the length of the array nums
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : No, TLE
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach

class contiguousArray_BruteForce {
    public int findMaxLength(int[] nums) {
        int n = nums.length;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int ones = 0, zeroes = 0;
            for (int j = i; j < n; j++) {
                if (nums[j] == 0) zeroes++;
                else ones++;
                if (ones == zeroes) {
                    ans = Math.max(ans, j-i+1);
                }
            }
        }
        return ans;
    }
}