// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> prefixSumMap = new HashMap<>();

        prefixSumMap.put(0, 1);

        int prefixSum = 0;
        int counter = 0;

        for(int num : nums){
            prefixSum += num;
            
            int excess = prefixSum - k;

            counter += prefixSumMap.getOrDefault(excess, 0);

            prefixSumMap.put(
                prefixSum,
                prefixSumMap.getOrDefault(prefixSum, 0)+1
            );
        }
        return counter;
    }
}