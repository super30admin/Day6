// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

import java.util.HashMap;
import java.util.Map;

public class ContiguosArray {

    public int findMaxLength(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int max = 0;
        int rSum = 0;
        map.put(0,-1);

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0)
                rSum = rSum +1;
            else
                rSum = rSum -1;
            if(map.containsKey(rSum))
                max = Math.max(max, i - map.get(rSum));
            else
                map.put(rSum, i);
        }
        return max;
    }
}
