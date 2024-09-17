// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
/* Using HashMap, key as count and values as index
 * If zero is found, do -1 from count and if One is found, do +1 from count
 * */


import java.util.HashMap;

public class ContiguousArray {
	 public  static int findMaxLength(int[] nums) {
	        if(nums == null || nums.length == 0)
	            return 0;
	        
	        int count = 0;
	        int maxLength = 0;
	        
	        HashMap<Integer, Integer> map = new HashMap<>();
	        
	        map.put(0, -1);		// Initializing map with zero as count and -1 as index(not present)
	        
	        for(int i=0; i<nums.length; i++){
	            if(nums[i] == 0)				// if zero if found, subtract the count by -1
	            	count+= -1;
	            else							// else, add the count by 1
	            	count+= 1;
	            
	            if(map.containsKey(count))		// If count is already existing in map, means there are equal no of zeros and ones in between the two indices
	                maxLength = Math.max(maxLength, i - map.get(count));
	            else
	                map.put(count, i);
	        }
	        return maxLength;
	    }
	 
	 public static void main(String[] args) {
			int[] nums = {0,1,0};
			System.out.print(findMaxLength(nums));
		}
}


/*******************Brute Force***********************/

/*class Solution {
    public int findMaxLength(int[] nums) {
        int totalCount = 0;
        int zeroCount = 0, onesCount =0;
        for(int i=0; i<nums.length; i++){
            for(int j=i; j<nums.length; j++){
                if(nums[j] == 0)
                    zeroCount++;
                else
                    onesCount++;
                
                if(zeroCount == onesCount)
                    totalCount = Math.max(totalCount, j-i+1);
            }
        }
        return totalCount;
    }
}*/