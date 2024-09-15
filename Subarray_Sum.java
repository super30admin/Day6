//Time Complexity : O(n)
//Space Complexity : O(1)
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this : None


import java.util.HashMap;
import java.util.Map;

class Subarray_Sum {
    public int subarraySum(int[] nums, int k) {
        if(nums == null || nums.length == 0)
        	return -1;
        int count = 0;
        int result = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        
        for(int i = 0; i < nums.length; i++)
        {
        	result += nums[i];
        	int tempResult = result - k;
        	
        	if(map.containsKey(tempResult))
        		count += map.get(tempResult);
        	
        	if(!map.containsKey(result))
        		map.put(result, 1);
        	else
        		map.put(result, map.get(result) + 1);	
        }
        return count;   
        
    }
    public static void main(String[] args)
    {
    		int[] arr = {3,3,4,3,-3,6};
    		Subarray_Sum ssm = new Subarray_Sum();
    		
    		System.out.println(ssm.subarraySum(arr, 7));
    	
    }
}
