import java.util.HashMap;

// Time Complexity :O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :No


// Your code here along with comments explaining your approach:
/*We will use Store the cumulative sum as the key and the index at which it occurred as the value. 
 */

public class ContiguousArray {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
       map.put(0, -1); // Base case: Cumulative sum 0 at index -1

       int maxLength = 0;
       int sum = 0; // Cumulative sum

       for (int i = 0; i < nums.length; i++) {
           // Convert 0 to -1 for balancing
           sum += (nums[i] == 0) ? -1 : 1;

           if (map.containsKey(sum)) {
               // If sum has been seen before, calculate the subarray length
               maxLength = Math.max(maxLength, i - map.get(sum));
           } else {
               // Store the first occurrence of this sum
               map.put(sum, i);
           }
       }

       return maxLength;
   }
    
}
