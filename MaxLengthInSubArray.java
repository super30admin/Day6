package com.Aug2020.Hashing2;

import java.util.HashMap;
import java.util.Map;

//Time Complexity : O(n)
//Space Complexity : O(n)
//Did this code successfully run on Leetcode : yes
//Any problem you faced while coding this :
//logic behind this was bit tricky to formulate.

public class MaxLengthInSubArray {
		public static void main(String[] args) {
			int arr[]  = {0,1};
			int max = findMaxLength(arr);
			System.out.println("Max length of contiguous with equal number of 0 and 1 => " + max);
		}
	
	  public static int findMaxLength(int[] nums) {
	        
          Map<Integer, Integer> map = new HashMap<>();
        map.put(0 , -1);
        int max = 0;
        int delta = 0;      //delta = numberOf "0" - numberOf "1"
        for (int i = 0; i < nums.length; i++) {
            delta += (nums[i] == 1) ? 1 : -1;
            map.put(delta, map.getOrDefault(delta, i));
            max = Math.max(max, i - map.get(delta));
            
        }
        return max;
        
        
        
      
    }
}
