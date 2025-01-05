// Time Complexity : O (n)
// Space Complexity : O (n)
// Did this code successfully run on Leetcode : Yes


// Your code here along with comments explaining your approach
/*
 * Maintain a running sum with -1 for 0 and 1 for 1
 * Maintain a map of the sum with the index first seen for that sum
 * If the sum is repeated, it indicates a subarray of equal 0s and 1s, use the map index to calculate the length
 * and update the maxLen
 */
class Solution {
    public int findMaxLength(int[] nums) {
        Map<Integer, Integer> rSum = new HashMap<>();
        int count = 0;
        int maxlen = 0;
        int i = 0;
        rSum.put(0, -1);
        for(int n: nums) {
            count += (n == 0) ? -1 : 1;
            if (rSum.containsKey(count)) {
                maxlen = Math.max(maxlen, i - rSum.get(count));
            } else {
                rSum.put(count, i);
            }
            i++;
        }
        return maxlen;
    }
}