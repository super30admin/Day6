// TC: O(N) where N represents number of elements in array and we need O(N) to traverse each element and check
// SC: O(N) we are using HashMap to store max n values if we have 0/1 unique values

// We will have a count for number of ones and zeros. If the number is 1, we add 1 to cnt, if  number is 0, we subtract 1 from cnt, This way. if the cnt
// is zero, we will know we have equal number of 0's and 1's. So, now to find the length, We will store count and index in map , 
// we will take a max len variable and once we have a cnt as 0 or if the map already contains the count,we will be calculating the
// max of existing len and the index upto that element.

import java.util.HashMap;

public class contigous_subarray {
	
	public int Contigous_SubArray(int[] nums) {
		
		HashMap<Integer, Integer> map = new HashMap();
		int cnt = 0;
		int maxlen = 0;
		for(int i=0;i<nums.length;i++) {
			
			cnt += (nums[i]==1)? 1: -1;
			
			if(cnt==0)
				maxlen = Math.max(maxlen, i+1);
			if(map.containsKey(cnt))
				maxlen = Math.max(maxlen, i-map.get(cnt));
			else 
				map.put(cnt, i);
		}
		return maxlen;
	}
	public static void main(String[] args) {
		
		int[] nums = {1, 1, 0, 1, 1, 1, 1};
		contigous_subarray cs = new contigous_subarray();
		System.out.println(cs.Contigous_SubArray(nums));
		
	}

}
