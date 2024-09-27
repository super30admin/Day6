// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

import java.util.HashMap;
import java.util.Map;

public class SubArrayEqualsK {

    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        int rSum = 0;
        //map <rSum, no. of times rSum has occured>
        map.put(0, 1);
        for(int i = 0; i< nums.length; i++){
            rSum = rSum + nums[i];
            if(map.containsKey(rSum - k)){
                count += map.get(rSum -k);
            }
            map.put(rSum, map.getOrDefault(rSum, 0) + 1);
        }

        return count;

    }
}
