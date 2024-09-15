// Time Complexity : O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class Solution {
    public int subarraySum(int[] nums, int k) {
        if(nums == null || nums.length == 0) return -1;

        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        int rSum = 0;
        int count = 0;

        // to handle edge case
        map.put(0, 1);

        for(int i = 0; i < n; i++) {
            // calculate the running sum
            rSum += nums[i];
            int diff = rSum - k;

            // if map contains the diff that means current subarray until last occured key adds up to target
            if(map.containsKey(diff)) {
                count += map.get(diff);
            }

            // maintain the frequency of rSum in HashMap
            map.put(rSum, map.getOrDefault(rSum, 0) + 1);
        }

        return count;
    }
}