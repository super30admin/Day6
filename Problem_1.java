import java.util.HashMap;

// Time Complexity : O(n) where n = size of array
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes

public class Problem_1 {
	
	public int subarraySum(int[] nums, int k) {
   
	    HashMap<Integer, Integer> map = new HashMap<>();
	    int cmpl = 0;
	    int count = 0;
	    int sum = 0;
	    map.put(0, 1);
	    for(int i = 0; i < nums.length; i++){
	        sum += nums[i];
	        cmpl = sum - k;
	        if(map.containsKey(cmpl)){
	            count += map.get(cmpl);
	        }
	        map.put(sum, map.getOrDefault(sum, 0) + 1);
	    }
	    return count;
	}
}
