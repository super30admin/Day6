// Time complexity: O(n) where n is the number of elements in the array.
// Space complexity: O(n) where n is the number of elements in the array.
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

import java.util.*;
class RunningSum {
    public int findMaxLength(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);         // To handle [0, 1] and [1, 0] edge case.
        int count = 0;          
        int max = 0;            // Max subarary length.
        for(int i = 0;i < nums.length; i++) {
            if(nums[i] == 0)
                count--;
            else
                count++;
            if(map.containsKey(count)){
                max = Math.max(max, i - map.get(count));        
            }
            else{
                map.put(count, i);      // Only the 1st occurence of count is put into the hashmap.
            }
        }
        return max;
    }
}