//Time Complexity : O(n)
//Space Complexity : O(n)
//Code run successfully on LeetCode.

import java.util.HashMap;

public class ContiguousArray {
	
	public int findMaxLength(int[] nums) {
        
	    if(nums == null|| nums.length == 0)
	    	return 0;
	    
		int rsum = 0;
		int max =0;
		HashMap<Integer, Integer> map = new HashMap<>();
		map.put(0, -1);
		
		for(int i =0; i < nums.length; i++) {
			
            if(nums[i] == 1)
			    rsum += 1;
            if(nums[i] == 0)
                rsum -= 1;
			if(map.containsKey(rsum)) {
				
				max = Math.max(max, i - map.get(rsum));
			}
			else
				map.put(rsum, i);
			
		}
		
    return max;
    
}

}
