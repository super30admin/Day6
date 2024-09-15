// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None.


// Your code here along with comments explaining your approach

class Solution {
	public int findMaxLength(int[] nums) {
		 HashMap<Integer, Integer> map = new HashMap<>();
		 int max = 0;
		 int sum = 0;
		 map.put(0, -1);
		 
		 for(int i = 0; i < nums.length; i++) {
			  sum = nums[i] == 0 ? sum-1 : sum+1;
			  if (map.containsKey(sum)) 
					max = Math.max(max, i-map.get(sum));
			  else map.put(sum, i);
		 }
		 
		 return max;
	}
}