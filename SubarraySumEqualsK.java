class Solution {
    // Time Complexity : O(n)
    // Space Complexity : O(n)
    // Did this code successfully run on Leetcode : Yes
    // Any problem you faced while coding this : No

    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>(); //map contains sum as key and its freq as value as we have to return
        // number of subarray having sum k
        map.put(0,1);
        int currSum = 0;
        int count = 0;
        for(int i = 0; i < nums.length; i++) {
            currSum += nums[i];
            if(map.containsKey(currSum-k))
                count += map.get(currSum-k);
            map.put(currSum, map.getOrDefault(currSum, 0) + 1);
        }

        return count;
    }
}