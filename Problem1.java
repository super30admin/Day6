// Time Complexity : O(n) where n = length of nums array
// Space Complexity : O(n) where n = length of nums array
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

import java.util.*;
public class Problem1 {

    public static int subarraySum(int[] nums, int k) {
        // Initialise count to 0 and cumulative sum to 0
        int count = 0, sum = 0;
        // Hashmap will contain the current cumulative sum as key and frequency as value 
        Map<Integer, Integer> map = new HashMap<>();
        // Since initially cumulative sum is 0, add (0, 1) to hashmap
        map.put(0, 1);
        for (int i = 0; i < nums.length; i++) {
            // Update cumulative sum till current element
            sum += nums[i];
            // If hashmap contains (sum - k), increment count by the corresponding value
            if (map.containsKey(sum - k)) {
                count += map.get(sum-k);
            }
            // If the cumulative sum is not present in hashmap, put it in hashmap with value 1.
            // If the cumulative sum is present in hashmap, increment the value corresponding to the cumulative sum by 1
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        // Return the total count
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,1};
        int k = 2;
        int ans = subarraySum(nums, k);
        System.out.println(ans);
    }
    
}
