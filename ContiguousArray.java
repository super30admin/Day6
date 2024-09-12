/*
 * #525. Contiguous Array
 * 
 * Given a binary array, find the maximum length of a contiguous subarray with equal number of 0 and 1.

Example 1:
Input: [0,1]
Output: 2
Explanation: [0, 1] is the longest contiguous subarray with equal number of 0 and 1.

Example 2:
Input: [0,1,0]
Output: 2
Explanation: [0, 1] (or [1, 0]) is a longest contiguous subarray with equal number of 0 and 1.

Note: The length of the given binary array will not exceed 50,000.

 */

/*
 * Time Complexity: O (N)
 * 
 * Space Complexity: O (N)
 * 
 * Did this code successfully run on leetcode: Yes
 * 
 * Any problem you faced while coding this: No
 * 
 */

package com.s30.edu.hashing2;

import java.util.HashMap;

public class ContiguousArray {
	
	public int findMaxLength(int[] nums) {
        
        int maxLength = 0; // Initialize max length of contiguous subarray with equal 0's and 1's
        int sum = 0; // Initialize the sum to 0
        
        // Create a Hashmap to store sum and index as key value pairs
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        // Traverse through the array
        for(int i = 0; i < nums.length; i++){
        	// If number is 1,. decrement the sum variable by 1
            if(nums[i] == 1){
                sum -= 1;
            }else{   // Else if 0, increment the sum variable by 1
                sum += 1;
            }
            
            // Check the base condition when sum becomes 0, that means the whole subarray from start index to present index can be considered as max length subarray
            if(sum == 0){
                maxLength = i + 1; // whole subarray from start to present index
            }
            
            // Check if sum on current index is already present in HashMap
            // If not, 
            if(!map.containsKey(sum)){ 
                map.put(sum, i); // put the sum and current index value in a map
            }
            // Else, get possible maximum length of subarray (present index - value of key "sum" in map)
            // value of key "sum" in a map is index where the value appeared first
            // Then, we compare that possible maximum length with maxLength and update maxLength accordingly
            else{
                maxLength = Math.max(maxLength, i - map.get(sum));
            }
        }
        
        return maxLength; // return the maximum length of a contiguous subarray with equal 0's and 1's
    }

}
