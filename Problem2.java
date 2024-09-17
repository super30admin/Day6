import java.util.HashMap;
import java.util.Map;

// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public int findMaxLength(int[] nums) {
        
        Map<Integer, Integer> result = new HashMap<>();
        
        // treating 0 as -1
        result.put(0, -1);
        
        int sum = 0;
        int maxLen = 0;
        
        for (int i = 0; i < nums.length; i++) {
            
            int num = nums[i];
            
            if (num == 0) {
                sum = sum - 1;
            }
            else {
                sum = sum + num;
            }
            
            if (result.containsKey(sum)) {
                maxLen = Math.max(maxLen, i - result.get(sum));
            }
            else {
                result.put(sum, i);
            }
        }
        return maxLen;
    }
}
