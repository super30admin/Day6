import java.util.HashMap;

/**
 * Idea is to use a HashMap to store the sum and frequency of sum. So while
 * processing an element, if runningSum - k already exist in map, add to result
 * counter.
 * 
 * Space Complexity: O(N), N is size of input array. 
 * Time Complexity: O(N)
 * 
 * Leetcode Result: Runtime: 14 ms, faster than 64.93% of Java online
 * submissions for Subarray Sum Equals K. 
 * Memory Usage: 39.9 MB, less than 71.74% of Java online submissions 
 * for Subarray Sum Equals K.
 */
public class SubarraySumK {
    public static void main(String args[]) {
        int[] nums = new int[] { 1, -1, 2, -2, 4 };
        int k = 4;
        System.out.println(subarraySum(nums, k)); // 3
    }

    /**
     * Given an array of integers and an integer k, you need to find the total
     * number of continuous subarrays whose sum equals to k.
     * 
     * @param nums input array
     * @param k
     * @return count of continuos subarray whose sum equals k.
     */
    private static int subarraySum(int[] nums, int k) {
        int count = 0;
        int runningSum = 0;
        // store sum and frequency of sum
        HashMap<Integer, Integer> map = new HashMap<>();
        // initially, sum 0 before we start processing
        map.put(0, 1);
        for (int i = 0; i < nums.length; i++) {
            runningSum += nums[i];
            if (map.containsKey(runningSum - k)) {
                // if we find 'runningSum - k' in map, increment counter by its frequency.
                count += map.get(runningSum - k);
            }
            // record this runningSum, either this is first time, else simply increment.
            map.put(runningSum, map.getOrDefault(runningSum, 0) + 1);
        }
        return count;
    }
}
