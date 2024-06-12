import java.util.*;
class Solution {
    public int findMaxLength(int[] nums) {
        int rSum=0;
		int count=0;
		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		map.put(0, -1);
		for(int i=0;i<nums.length;i++) {
			if(nums[i]==0)
				rSum=rSum-1;
			else
				rSum=rSum+1;
			if(map.containsKey(rSum)) {
				if(count<i-map.get(rSum)) {
					count=i-map.get(rSum);
				}
			}
			else {
				map.put(rSum,i);
			}
		}
		return count;
    }
}