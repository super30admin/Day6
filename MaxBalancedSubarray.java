// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :

import java.util.HashMap;

public class MaxBalancedSubarray {
        public int findMaxLength(int[] nums) {
            // store the map of runsum with its earliest index
            HashMap<Integer, Integer> rmap = new HashMap<>();
            rmap.put(0, -1); // edge case
            int runsum = 0;
            int max = 0;
            for (int i = 0; i < nums.length; i++) {
                if(nums[i] == 0){
                    runsum--;
                }else{
                    runsum++;
                }
                if (rmap.containsKey(runsum)) {
                    max = Math.max(max, i - rmap.get(runsum));
                } else {
                    rmap.put(runsum, i);
                }
    
            }
            return max;
    
        }
}
