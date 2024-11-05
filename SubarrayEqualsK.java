// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach: similar to the contiguous
//subarray problem, we are keeping the running sum here as well. so if we have the sum-k present
//that means that the target is achieved.



import java.util.*;
/**
 * SubarrayEqualsK : SubarrayEqualsK
 *
 * @author : Kavya Mandaliya
 * @version : 1.0 (Nov 04, 2024)
 * @since : 1.0 (Nov 04, 2024)
 */

public class SubarrayEqualsK {
    public int subarraySum(int[] nums, int k) {
        int sum = 0, count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        for(int i = 0; i < nums.length; i++){
            sum+=nums[i];
            if(map.containsKey(sum-k)){
                count+=map.get(sum-k);
            }
            map.put(sum, map.getOrDefault(sum,0)+1);
        }
        return count;
    }

}
