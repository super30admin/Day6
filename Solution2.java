// Time Complexity : O(N), where N is the length of nums. 
// Space Complexity : O(N), to maintain the running sum information in the hashmap.

import java.util.*;
class Solution {
    public int findMaxLength(int[] nums) {
        //maintaining a hashmap where key is the running same and value is the index where the sum was first encountered. 
        HashMap<Integer, Integer> map = new HashMap<>();
        // initializing the hashmap to handle edge cases. 
        map.put(0,-1); 
        int maxLength = 0, sum = 0;
        for (int i = 0; i < nums.length; i++) {
            // if nums[i] is 1, add 1, else add -1. 
            sum += (nums[i] == 0 ? -1 : 1);
            // if the map already contains the current running sum, update the maxLength encountered so far. 
            if (map.containsKey(sum)) {
                maxLength = Math.max(i - map.get(sum), maxLength);
            }
            // else put the running sum in the map with the corresponding index. 
            else {
                map.put(sum, i);
            }
        }
        // return maxLength
        return maxLength;     
    }
}