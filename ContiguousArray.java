
// Time Complexity : O(n) , nums array traversed once
// Space Complexity : O(n) for hashmap
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int findMaxLength(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,-1);
        int maxLength = 0, count = 0;
        
        for (int i=0; i<nums.length; i++){
            count = count + (nums[i] == 1 ? 1 : -1); // count incremented if  nums[i] is 1, decremented if 0; if count = 0 eqqual numbers
            if (map.containsKey(count)){
                maxLength = Math.max(maxLength, i - map.get(count));
            }
            else{
                map.put(count, i);
            }
        }
        return maxLength;
    }
}