// Time Complexity : O(n)
// Explaination : n is length of nums as we go through the array once
// Space Complexity : O(n)
// Explaination : Auxiliary map will contain 1 entry for each element in nums (worst case, all 0s or all 1s)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : no, but Raj's explaination in class made it easy to code up.
// Time taken : 10

import java.util.HashMap;
import java.util.Map;

public class ContiguousArray {
    public int findMaxLength(int[] nums) {
        if(nums == null || nums.length == 0)
            return -1;
        Map<Integer, Integer> map = new HashMap<>();
        int rSum = 0, max = 0;
        // Reference for the first element
        map.put(0,-1);
        for(int i=0; i<nums.length; i++){
            rSum += (nums[i] == 1 ? 1 : -1);
            if(map.containsKey(rSum)){
                max = Math.max(max, i-map.get(rSum));
            }else {
                map.put(rSum, i);
            }
        }
        return max;
    }
}
