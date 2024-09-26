/**
 Time Complexity: O(n) where n is the length of nums array
 Space complexity: O(n) which is used by map

 Approach: so here we are calculating the rolling sum at each iteration and then we subtract the sum with the value of K which sum we want this tells us that if we want a sum k we shld sbtract this value from current sum to see if we have encountered that value we have hashmap with count of that value we have encountered till now.
 */
class Solution {
    public int subarraySum(int[] nums, int k) {
        if (nums == null || nums.length == 0) return 0;

        Map<Integer, Integer> rSumToCount = new HashMap<>();
        int count = 0;
        int rSum = 0;
        rSumToCount.put(0, 1);
        for(int num : nums) {
            rSum += num;

            if (rSumToCount.containsKey(rSum - k)) {
                count += rSumToCount.get(rSum - k);
            }

            rSumToCount.put(rSum, rSumToCount.getOrDefault(rSum, 0) + 1);
        }

        return count;
    }
}