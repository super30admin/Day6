// Time Complexity : O(n) where n = length of nums array
// Space Complexity : O(n) where n = length of nums array
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

import java.util.*;
public class Problem2 {
    
    public static int findMaxLength(int[] nums) {
        // Initialise maxlength to 0 and cumulative sum to 0
        int sum = 0, maxlength = 0;
        // Hashmap will contain the current cumulative sum [Add -1 if element is 0 and 1 if element is 1] as key and first occurence index as value
        Map<Integer, Integer> map = new HashMap<>();
        // Since initially cumulative sum is 0, add (0, -1) to hashmap
        map.put(0, -1);
        for (int i = 0; i < nums.length; i++) {
            // Update cumulative sum till current element
            // Add -1 if element is 0 and 1 if element is 1
            sum += nums[i] == 0 ? -1 : nums[i];
            // If hashmap contains sum, update maxlength by max(maxlength, difference of present index and first occurred index of sum)
            if (map.containsKey(sum)) {
                maxlength = Math.max(maxlength, i - map.get(sum));
            } else { // If hashmap doesn't contain sum, add (sum, current index) to the hashmap
                map.put(sum, i);
            }
        }
        // Return the value of maxlength
        return maxlength;
    }

    public static void main(String[] args) {
        int[] nums = {0,1,0};
        int ans = findMaxLength(nums);
        System.out.println(ans);
    }
}
