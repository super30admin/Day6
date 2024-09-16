// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
/* 
 * Running sum pattern is used. 
 * 
*/

import java.util.*;

class ContiguousSubArray {
    public static int findMaxLength(int[] nums) {
        if(nums == null || nums.length == 0) return 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        // Initializing the map with (0, -1).
        
        map.put(0, -1);
        int max = 0, count  = 0;
        for(int i = 0; i < nums.length; i++){
           
            count = (nums[i] == 0)?count-1:count+1;

            // If we have encountered this count previously, 
            // that means we have a contiguous array between the previously found index and the current index.
            if(map.containsKey(count)){
                max = Math.max(max, i - map.get(count));
            }else{
                // If this is a new count, then we update the count and the index in the map for later.
                map.put(count, i);
            }
        }

        
        return max;
    }
}