// Time Complexity : O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


class Solution {
    public int subarraySum(int[] nums, int k) {
       int count = 0;
        int sum = 0;
        int start = 0;
        int end = 0;
        
        HashMap<Integer, Integer> map = new HashMap<>(); 
        map.put(0,1);		// initializing the map with the first 2 elements
        
        for(int i = 0; i < nums.length; i++){		//traverse through the array
            sum += nums[i];							//find the sum everytime we find the new element
            if(map.containsKey(sum - k)){			// check if the HashMap contains sum-k as key
                count += map.get(sum - k);			// if found, increment the counter
            }
            map.put(sum, map.getOrDefault(sum,0) + 1);	// if not found, create a new map with default value for the new sum
            
        }
        
        return count;		// return the final count 
    }
}