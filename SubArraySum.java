/*
 * #560. Subarray Sum Equals K
 * 
 * Given an array of integers and an integer k, you need to find the total number of continuous subarrays whose sum equals to k.

Example 1:

Input:nums = [1,1,1], k = 2
Output: 2
 

Constraints:

The length of the array is in range [1, 20,000].
The range of numbers in the array is [-1000, 1000] and the range of the integer k is [-1e7, 1e7].

 */

/*
 * Time Complexity: O (N) -> Traverse the array
 * 
 * Space Complexity: O (N) -> We are using HashMap to store sum and no of subarrays for that sum
 * 
 * Did this code successfully run on leetcode: Yes
 * 
 * Any problem you faced while coding this: No
 * 
 */


package com.s30.edu.hashing2;

import java.util.HashMap;

public class SubArraySum {
	
public int subarraySum(int[] nums, int k) {
        
        int sum = 0; // Initialize the sum
        int count = 0; // Initialize no of subarrays with sum = k
        
        // Create a HashMap to store sum and no of subarrays
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        // Before even starting to traverse the array, there is 1 subarray with sum = 0, empty subarray
        // (sum, subarray) for empty subarray -> (0, 1)
        map.put(0, 1);
        
        // Traverse through the array
        for(int i = 0; i < nums.length; i++){
            sum += nums[i]; // Calculate the sum
            
            int complement = sum - k; // Compute the complement, to check if any subarray with sum = k exists before current point
            
            // First check if the complement value is already present in a map
            // If yes, then get the corresponding value of subarray and add to count value
            // Otherwise, do nothing
            if(map.containsKey(complement)){
                count += map.get(complement);
            }
            
            // After, check if sum is already present in a map
            // If not, put the sum and no of subarray (initially 1 for a new sum value) in a map
            if(!map.containsKey(sum)){
                map.put(sum, 1);
            // Else, don't add same sum as different key, just update (increment) the corresponding subarray value by 1
            }else{
                map.put(sum, map.get(sum) + 1);
            }
        }
        
        return count; // return the total no of continuous subarrays with sum = k
    }

}
