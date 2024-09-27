// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : No (Premium problem)
// Any problem you faced while coding this : Conceptually its a bit complex


// Your code here along with comments explaining your approach
public class Solution {
    /**
     * @param nums: an array
     * @param k: a target value
     * @return: the maximum length of a subarray that sums to k
     */
    public int maxSubArrayLen(int[] nums, int k) {
        // Write your code here
        if (nums == null || nums.length == 0) return 0;

        // The map will contain <rolling-sum, number of occurances>
        HashMap<Integer, Integer> map = new HashMap<>();
        // The base case in map will contain 0 key with a value 1
        map.put(0, 1);

        // Initialize final count and rolling sum to 0
        int count=0, rSum=0;

        for (int i=0; i<nums.length; i++) {
            // Update the rolling sum
            rSum += nums[i];

            // Update the map with count if map contains the current rolling sum - k value
            if (map.containsKey(rSum-k)) {
                count += map.get(rSum-k);
            }
            map.put(rSum, map.getOrDefault(rSum, 0) + 1);
        }

        return count;
    }
}