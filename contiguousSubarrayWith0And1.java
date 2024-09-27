/**
Problem: https://leetcode.com/problems/contiguous-array/submissions/
Time complexity: O(n)
Space complexity: O(n)
*/
class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> sumToIndexMap = new HashMap<>();
        int maxLen = 0;
        int sum = 0;
        
        sumToIndexMap.put(0, -1);
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] == 0) {
                --sum;
            } else {
                ++sum;
            }
            // We don't want to update map in this case. We want to keep the first index at which sum was found
            // so that we can get max length
            if (sumToIndexMap.containsKey(sum)) {
                maxLen = Math.max(maxLen, i - sumToIndexMap.get(sum));
            } else {
                sumToIndexMap.put(sum, i);
            }
        }
        return maxLen;
    }
}