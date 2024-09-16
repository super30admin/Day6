// TC: O(N) where N represents the number of elements in the array.
// SC: O(N) since we are using hashmap to store N values

// SubarraySum is brute force approach
// Optimized solution - SubarraySumMap, Calculate the currsum of the number and keep appending the currsum with new number of the array. Once we have the 
// currsum, we check the currsum with the given sum, if they are same, we will update our res count.
// We will store the currsum and the count in the hashmap so that we can map the occurences of the currsum and save those occurences in the result.
// we will check if the currsum - given sum are present in the hashmap, if presents, we will update our result with new count of the occurence.

import java.util.HashMap;

public class subarray_sum {
	
	public int SubarraySum(int[] nums, int k) {
		int cnt = 0;
		for(int i=0;i<nums.length;i++) {
			int sum = 0;
			
			for(int j=i;j<nums.length;j++) {
				sum +=nums[j];
				if(sum==k)
					cnt++;			
			}
		}
		return cnt;
	}
	
	public int SubarraySumMap(int[] nums, int k) {
		HashMap<Integer, Integer> map = new HashMap<>();
		int res = 0;
		int currsum = 0;
		for(int i=0;i<nums.length;i++) {
			currsum+= nums[i];
			
			if(currsum==k)
				res++;
			
			if(map.containsKey(currsum-k))
				res+= map.get(currsum-k);
				
			map.put(currsum, map.getOrDefault(currsum, 0)+1);	
		}
		return res;
	}
	
	public static void main(String[] args) {
		
		subarray_sum ss = new subarray_sum();
		int[] nums = {23, 2, 2, 4, 6, 7};
		System.out.println(ss.SubarraySumMap(nums, 6));
	}

}
