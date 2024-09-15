//Time Complexity : O(n)
//Space Complexity : O(n)
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this : Found it difficult in finding the best solution at first attempt.


import java.util.HashMap;

class Contiguous_Array_525 {
    public int findMaxLength(int[] nums) {
        if(nums == null || nums.length == 0)
        	return 0;
        int sum = 0;
        int maxLength = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,  -1);
        for(int i = 0; i < nums.length; i++)
        {
        	if(nums[i] == 1)
        		sum += 1;
        	else
        		sum -= 1;
        	if(!map.containsKey(sum))
        		map.put(sum, i);
        	else
        		maxLength = Math.max(maxLength, i - map.get(sum));
        }
        return maxLength;
    }
    
    public static void main(String[] args)
    {
    	int[] arr = {0,1,0,1,0,1,1,1,1,0,0,1,0,1,1};
    	Contiguous_Array_525 CA = new Contiguous_Array_525();
    	System.out.println(CA.findMaxLength(arr));
    }
}
