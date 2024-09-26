    
		// Time Complexity : O(N)
	// Space Complexity : O(N)
	// Did this code successfully run on Leetcode : yes
	// Any problem you faced while coding this :
	// Had a problem on which one has to be stored as a key and which one as a value
	//Your code here along with comments explaining your approach


class Solution {
    
    public int subarraySum(int[] nums, int k) {
        
        
        HashMap<Integer,Integer> map = new HashMap<>();
        int count = 0;
        int sum = 0;
        map.put(0,1);
		
        for(int i = 0 ; i < nums.length;i++){
            sum  = sum+nums[i];
            int diff = sum - k;
            if(map.containsKey(diff))
               count = count + map.get(diff);
             map.put(sum, map.getOrDefault(sum, 0) + 1);
            
         
        }
        
        
        
       return count;
    }
}
