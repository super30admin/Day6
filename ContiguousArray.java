// Time complexity: O(n)
// Space Complexity: O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
// Approach: Maintain a hashmap with (runningSum, index). Whenever 2 runningSums in the hashmap are same, we can say that subarray is balanced/contiguous

import java.util.HashMap;
import java.util.Map;

class ContiguousArray {
    public int findMaxLength(int[] nums) {
        int runningSum = 0;
        int length = 0;
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,-1); // Have sum of 0 before starting of the array(It is neither +1 nor -1)
        for(int i=0;i<nums.length;i++) {
            if(nums[i] == 0) runningSum += -1;
            else runningSum += 1;
            if(!map.containsKey(runningSum)) {
                map.put(runningSum,i);
            } else{
                if(length < i-map.get(runningSum))
                length = i-map.get(runningSum);
            }
        }
    return length;
    }
}