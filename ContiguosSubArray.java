// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

import java.util.*;

class ContiguosSubArray {
    public int findMaxLength(int[] nums) {
        if(nums == null || nums.length == 0) return -1;
        
        int count = 0, maxLength = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        
        for(int i = 0; i < nums.length; i++) {
            count += nums[i] == 0 ? -1 : 1;
            
            if(map.containsKey(count)) {
                maxLength = Math.max(maxLength, i - map.get(count));
            } else {
                map.put(count, i);
            }
        }
        return maxLength;
    }
}