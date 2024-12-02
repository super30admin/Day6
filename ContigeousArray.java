// Time Complexity : O(n)  n=number of elements in input array
// Space Complexity :o(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No


class Solution {
    public int findMaxLength(int[] nums) {
        int size=nums.length;
        int rSum = 0;
		int Max = 0;
		Map<Integer, Integer> map = new HashMap<>();
        map.put(0,-1);
		for(int i=0;i<size;i++)
		{
            if(nums[i]==1)
            {
                rSum++;
            }
            else
            {
                rSum--;
            }
			if(map.containsKey(rSum))
			{
				Max=Math.max(Max, i-map.get(rSum));
			}
			else
			{
				map.put(rSum, i);
			}
		}
        return Max;
    }
}