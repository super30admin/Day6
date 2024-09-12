// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :

class Solution {
    public int subarraySum(int[] nums, int k) {
        int size = nums.length, tempSum = 0, ret = 0;
        HashMap<Integer, Integer> sumCount = new HashMap<>();
        sumCount.put(0, 1);
        for (int i: nums) {
            tempSum += i;
            if (sumCount.containsKey(tempSum - k)) {
                ret += sumCount.get(tempSum - k);
            }
            if (sumCount.get(tempSum) != null) {
                sumCount.put(tempSum, sumCount.get(tempSum) + 1);
            } else {
                sumCount.put(tempSum, 1);
            }
        }

        return ret;
    }
}