// Time Complexity : O(n)
// Explaination : n is length of nums as we go through the array once
// Space Complexity : O(n)
// Explaination : Auxiliary map will contain 1 entry for each element in nums
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : no, but Raj's explaination in class made it easy to code up.
// Time taken : 10

import java.util.HashMap;
import java.util.Map;

public class SubArraySumEqualsK {
    public int subarraySum(int[] nums, int k) {
        int rSum = 0;
        if(nums == null || nums.length == 0)
            return -1;

        int count = 0;
        // Map contains <running Sum as key, number of times we've seen the rSum before>
        Map<Integer, Integer> map = new HashMap();
        map.put(0,1);
        for(int i=0; i<nums.length; i++){
            rSum += nums[i];
            if(map.containsKey(rSum-k)){
                count += map.get(rSum-k);
//                map.put(rSum, map.get(rSum)+1);
            }
            // If we've seen rSum before, add 1 to the # we've seen it, or add new rSum with seen as 1
            map.put(rSum, map.getOrDefault(rSum,0)+1);
        }
        return count;
    }
}
