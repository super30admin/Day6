// Time Complexity :O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :
class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        int sum = 0;
        HashMap<Integer, Integer> hmap = new HashMap<>();
        hmap.put(0, 1);
        for (int i = 0; i < nums.length; i++) {
            // cumulative sum to current element
            sum += nums[i];
            // difference sum-k will tell the subarray with sum k occured
            if (hmap.containsKey(sum - k))
                count += hmap.get(sum - k);
            // if same sum found increment
            hmap.put(sum, hmap.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}