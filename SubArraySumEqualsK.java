import java.util.HashMap;

public class SubArraySumEqualsK {
    public int subarraySum(int[] nums, int k) {
        int count = 0, prefixSum = 0;
        HashMap<Integer, Integer> sumCount = new HashMap<>();

        // Base case: a sum of 0 occurs once (empty subarray)
        sumCount.put(0, 1);

        for (int num : nums) {
            prefixSum += num;

            // Check if there is a prefix sum that gives the required sum
            if (sumCount.containsKey(prefixSum - k)) {
                count += sumCount.get(prefixSum - k);
            }

            // Update the frequency of the prefix sum
            sumCount.put(prefixSum, sumCount.getOrDefault(prefixSum, 0) + 1);
        }

        return count;

    }
}