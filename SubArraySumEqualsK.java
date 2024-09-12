package hashing2;

import java.util.HashMap;
import java.util.Map;

public class SubArraySumEqualsK {
	//Time Complexity : O(n), where n is the length of array nums
	//Space Complexity : O(n)
	//Did this code successfully run on Leetcode : Yes
	//Any problem you faced while coding this : Storing the pre sum with its frequency and checking
	//for sum - k
	public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        
        int sum = 0;
        int count = 0;
        
        for(int i: nums) {
            sum += i;
            if(map.containsKey(sum - k))
                count += map.get(sum - k);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        
        return count;
    }
}
