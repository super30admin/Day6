package hashing2;

import java.util.HashMap;
import java.util.Map;

public class ContiguousArray {
	//Time Complexity : O(n), where n is the length of array nums
	//Space Complexity : O(n)
	//Did this code successfully run on Leetcode : Yes
	//Any problem you faced while coding this : Considering 0 as -1 and finding where sub-array
	//totals 0
	public int findMaxLength(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        
        int sum = 0;
        int count = 0;
        
        for(int i=0; i<nums.length; i++) {
            sum += nums[i] == 0 ? -1 : 1;
            
            if(map.containsKey(sum))
                count = Math.max(count, i - map.get(sum));
            else
                map.put(sum, i);
        }
        
        return count;
    }
}
