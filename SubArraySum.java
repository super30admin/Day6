// Time Complexity : O(n)
// Space Complexity :O(n). n is the length of the array
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class Solution {
    public int subarraySum(int[] nums, int k) {
        
     if (nums != null && nums.length > 0) {
			int count=0;
			int sum=0;
			HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();

			for(int num:nums) {
				sum+=num;
				if(sum==k)
					count++;
				if(hashMap.containsKey(sum-k) ) {
					count+=hashMap.get(sum-k);
				}
				if(hashMap.containsKey(sum))
					hashMap.put(sum,hashMap.get(sum)+1);
				else
					hashMap.put(sum,1);
			}
			return count;
		}
		return -1;
	}
}
