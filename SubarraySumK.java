// Time Complexity : O (n)
// Space Complexity : O (n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Initially tried a sliding window approach, which does not work as it is not
// possible to predict whether to increase/decrease the size of the window based on the new element


// Your code here along with comments explaining your approach
/* Cumulative sum method:
 * Store the number of times each cumulative sum occurs
 * when you find a cumulative sum such that currSum - k = prevSum,
 * the number of occurrences of prevSum are to be included in the
 * number of subarrays - since currSum - prevSum = k implies that
 * the interceding subarray sums to k
 */
class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> cumSumFreq = new HashMap<>();

        int i;
        int len = nums.length;
        int cumulativeSum = 0;
        int count = 0; // result
        cumSumFreq.put(0, 1);
        for(i = 0; i < len; i++) {
            // calculate cumulative sum
            cumulativeSum += nums[i];

            // if cumulativeSum - k exists in the map,
            // increment result by corresponding frequency
            if(cumSumFreq.containsKey(cumulativeSum - k)) {
                count += cumSumFreq.get(cumulativeSum - k);
            }

            // put the cumulativeSum in the map
            cumSumFreq.put(cumulativeSum, cumSumFreq.getOrDefault(cumulativeSum, 0) + 1);
        }
        return count;
    }
}