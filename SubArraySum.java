import java.util.HashMap;

// Time Complexity :O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :No


// Your code here along with comments explaining your approach:
/*We will use HashMap to store the cumulative sum (sum) up to the current index
 */

public class SubArraySum {

    public int subarraySum(int[] nums, int k) {

        // HashMap to store cumulative sum and its frequency
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1); // Initialize with sum 0 having one occurrence

        int sum = 0;   // Cumulative sum
        int count = 0; // Count of subarrays with sum k

        for (int num : nums) {
            sum += num; // Update cumulative sum

            // Check if (sum - k) exists in the map
            if (map.containsKey(sum - k)) {
                count += map.get(sum - k); // Add the frequency of (sum - k) to count
            }

            // Update the frequency of the current sum in the map
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return count;
    }
    
}
