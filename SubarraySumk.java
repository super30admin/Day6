// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :

import java.util.HashMap;

public class SubarraySumk {
        public int subarraySum(int[] nums, int k) {
            HashMap<Integer, Integer> map = new HashMap<>(); //map of runsum and its count of occurance
            map.put(0,1); //edge case
            int count = 0;
            int runsum = 0;
            for (int i = 0; i < nums.length; i++) {
                runsum += nums[i];
    
                if (map.containsKey(runsum - k)) {
                    count += map.get(runsum - k); 
                }
                if(!map.containsKey(runsum)){
                    map.put(runsum,1);
                }else{
                    map.put(runsum, map.get(runsum)+ 1);  //increase count of runsum
                }
                
            }
            return count;
        }
    
}
