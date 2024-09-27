/**
Problem: https://leetcode.com/problems/subarray-sum-equals-k/
Time complexity: O(n)
Space complexity: O(n)
*/
class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> sumToIndexMap = new HashMap<>();
        int count = 0;
        int sum = 0;
        
        sumToIndexMap.put(0, 1);
        for (int i = 0; i < nums.length; ++i) {
            sum += nums[i];
            
            if (sumToIndexMap.containsKey(sum - k)) {
                count += sumToIndexMap.get(sum - k);
            }
            sumToIndexMap.put(sum, sumToIndexMap.getOrDefault(sum, 0) + 1);
        }
        
        return count;
    }
}