package com.javadwarf.leetcode.subarray;

import java.util.HashMap;
import java.util.Map;

public class _560_SubarraySumEqualsK {

	public static void main(String[] args) {
		int[] arr = {1,1,1};
		int[] arr1 = {-1,-1,1};
		int[] arr2 = {28,54,7,-70,22,65,-6};

		System.out.println(new _560_SubarraySumEqualsK().subarraySum(arr, 2));
		//System.out.println(new _560_SubarraySumEqualsK().subarraySum(arr1, 0));
		//System.out.println(new _560_SubarraySumEqualsK().subarraySum(arr2, 100));

	}

	//o(n) and o(n)
	
	/*
	 *  If the cumulative sum(represented by sum[i] for sum upto ith index) upto two indices is the same, the sum of the elements lying in between those indices is zero. 
	 *  Extending the same thought further, if the cumulative sum upto two indices, say i and j is at a difference of k i.e. if sum[i] - sum[j]=k, the sum of elements lying between indices i and j is k.
         Based on these thoughts, we make use of a hashmap  which is used to store the cumulative sum upto all the indices possible along with the number of times the same sum occurs. 
         We store the data in the form: (sum_i, no. of occurences of sum_i)
		We traverse over the array nums array and keep on finding the cumulative sum. 
		Every time we encounter a new sum, we make a new entry in the hashmap corresponding to that sum. If the same sum occurs again, we increment the count corresponding to that sum in the hashmap. 
		Further, for every sum encountered, we also determine the number of times the sum sum−k has occurred already, 
		since it will determine the number of times a subarray with sum k has occurred upto the current index. We increment the count by the same amount.
	 */
	
	
	public int subarraySum(int[] nums, int k) {
	       int count = 0 ;

			Map<Integer, Integer> map = new HashMap<>();
	        map.put(0,1);
	        
	        int sum = 0;
	        
	        for(int i=0;i<nums.length; i++){
	            sum += nums[i];
	            count += map.getOrDefault(sum-k,0);
	            map.put(sum,map.getOrDefault(sum,0)+1);
	        }
	        
			return count;
	    }

	// brute force - o(n^2)
	public int subarraySum2(int[] nums, int k) {

		int count = 0 ;

		for(int i=0; i<nums.length;i++) {

			int sum = 0;

			for(int j =i; j<nums.length; j++) {
				sum += nums[j];
				if(sum == k) {
					count++;
				}
			}
		}
		return count;
	}


	//tried sliding window wont work 
	public int subarraySum_SW(int[] nums, int k) {

		int start = 0;
		int end = 0;

		int count  = 0;
		int curr = 0;

		while(end < nums.length) {
			curr  += nums[end];
			while((end == nums.length-1 || curr >= k) && start < nums.length) {
				if(curr == k) {
					count++;
				}
				curr -= nums[start];
				start++;
			}
			end++;
		}

		return count;

	}

}
