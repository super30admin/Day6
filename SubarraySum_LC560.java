import java.util.HashMap;

// Time Complexity: O (N) N: length of array nums
// Space Complexity: O (N) due to hashmap
// Did this code successfully run on Leetcode : Yes
public class SubarraySum_LC560 {
    public int subarraySum(int[] nums, int k) {
        int runningSum = 0, count = 0;
        HashMap<Integer, Integer> sumCounts = new HashMap<>();
        sumCounts.put(0, 1);  // subarray size zero: empty set

        for (int i = 0; i < nums.length; i++) {
            runningSum += nums[i];
            if (sumCounts.containsKey(runningSum - k))
                count += sumCounts.get(runningSum - k);
            sumCounts.put(runningSum, sumCounts.getOrDefault(runningSum, 0) + 1);
        }
        return count;
    }
}
