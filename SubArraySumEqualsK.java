// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

import java.util.*;
class SubArraySumEqualsK {
    public int subarraySum(int[] nums, int k) {
        int runningSum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        int result = 0;
        map.put(0,1);
        for(int n: nums) {
            runningSum += n;
            
            if(map.containsKey(runningSum-k)) {
                result += map.get(runningSum-k);
            }
            
            map.put(runningSum, map.getOrDefault(runningSum, 0) + 1);
        }
        return result;
    }
}