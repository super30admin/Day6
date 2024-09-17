// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
// The trick in this case is to understand that at any point of time, if the running sum's complement has been observed before, then it 
// means that the sum of numbers in between form the maximum equal occurrences of 0 and 1. For simplicity, occurrence of 0 is calculated
// as -1 addition in cumulative sum.

import java.util.*;
class ContiguousArray {
    public int findMaxLength(int[] nums) {
        //edge case
        if(nums == null || nums.length == 0) {
            return 0;
        }
        int sum = 0, max = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        for(int i = 0; i < nums.length; i++) {
            nums[i] = nums[i]== 0 ? -1 : 1;
            sum += nums[i];
            if(map.containsKey(sum)) {
                max = Math.max(max, i-map.get(sum));
            }
            else map.put(sum, i);
        }
        return max;
    }
}