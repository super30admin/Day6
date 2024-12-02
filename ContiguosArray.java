// Time Complexity : O(n)
// Space Complexity :O(n). n is the length of the array
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public int findMaxLength(int[] nums) {
        if (nums.length > 0) {

			HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
            hashMap.put(0,-1);
			int count = 0;
			int len = 0;
			for (int num = 0; num < nums.length; num++) {
				if (nums[num] == 0)
					count += -1;
				else
					count += 1;

				if (hashMap.containsKey(count)) {
					len = Math.max(len, num - hashMap.get(count));
				} else
					hashMap.put(count, num);
			}
			return len;
		}
		return 0;
	}
    
}
