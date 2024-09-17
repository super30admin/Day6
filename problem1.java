//Problem1 (https://leetcode.com/problems/subarray-sum-equals-k/)

// Time Complexity : O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Nothing as such

public class problem1 {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int result = 0;
        int rSum = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            rSum += nums[i];
            if (map.containsKey(rSum - k)) {
                result = result + map.get((rSum - k));
            }
            if (!map.containsKey(rSum)) {
                map.put(rSum, 0);
            }
            map.put(rSum, map.get(rSum) + 1);
        }
        return result;
    }
}
