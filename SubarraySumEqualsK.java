package Oct20;

import java.util.HashMap;
import java.util.Map;

class SubarraySumEqualsK {
    public int subarraySum(int[] nums, int k) {
        
    // Time Complexity: O(n) where n is number of elements in given array.
	// Because we are traversing the array once completely which is O(n).
	// Also we are doing put, contains and get operations on Hashmap with integer key, which is O(1).

	// Space Complexity: O(n) 
	// There will be max n entries in the hashmap if all n elements sum upto different running sum values. So, O(n) space complexity.
	        
	// Did this code successfully run on Leetcode : Yes

	// Any problem you faced while coding this : No

	// Approach: 
	// We initialise a running sum variable with 0. Each array element is added to running sum.
	// Manage a hashmap where we store key = current running sum AND value = how many times has the running sum happened.
    // For edge case, we should insert key=0, value=1 in hashmap right after initializing it.
	// Concept: While processing the array, if sum of elements till Ith index is S1 and till Jth index is S2 and S2-S1 = k, then we have a continuous subarray with sum k between index I and J.
	/*
        When iterating through the array:
    
        1) find running sum = running sum value till now + currennt array element
        2) find complement = running sum-target(k)
        3) check if complement exists in the hashmap
            if yes, add the value of hashmap entry(with key = complement) to count variable.
        4) check if running sum exists in the hashmap
            if yes, increase value of hashmap entry by 1.
            if no, add an entry with key= running sum and value =1
        
        After iterations are completed:
        Return count variable value.
        
        Example: 
        k = 7
        arr[i]      = 3  4   7   2   -3  1   4   2   0   1
        i           = 0  1   2   3   4   5   6   7   8   9
        runningSum  = 3  7   14  16  13  14  18  20  20  21
        
        key(=runningSum)         value              complement                  count
                            (=how many times 
                            the running sum has 
                            happened)       
        0                        1                                                       
        3                        1                 3-7=-4(not happened 
                                                   before in hashmap)                       
        7                        1                 7-7=0(happened          0's value added                                                              before in hashmap)      to count, i.e.1 
        14                       1+1 = 2           14-7=7(happened         7's value added                                                              before in hashmap)      to count,i.e.(1)+1
        16                       1                 16-7=9(not happened                                                                                  before in hashmap)       
        13                       1                 13-7=6(not happened                                                                                  before in hashmap)
 14                                                14-7=7(happened         7's value added                                                              before in hashmap)      to count,i.e.(1+1)+1
        18                       1                 18-7=11(not happened                                                                                  before in hashmap)
        20                       1+1 = 2           20-7=13(happened        13's value added                                                            before in hashmap)        to count,i.e.(1+1+1)+1
 20                                                20-7=13(happened        13's value added                                                              before in hashmap)      to count,i.e.(1+1+1+1)+1
        21                       1                 21-7=14(happened        14's value added     
                                                   before in hashmap)   to count, i.e.(1+1+1+1+1)+(2)
        
       
       count = 7 at the end of loop
    */
	 
        
        // edge cases        
        if (nums == null || nums.length == 0) {
            return 0;
        }
        
        Map<Integer, Integer> hm = new HashMap<>();
        // used to handle edge cases like when array is (3,4,...) or (3,4) and target = 7
        hm.put(0,1);
        
         // variable to hold cumulative sum till current index element
        int runningSum = 0;
        
         // variable to hold result
        int count = 0;
        
        for (int i = 0; i < nums.length; i++) {
            
            runningSum += nums[i];
            int complement = runningSum - k;
            if (hm.containsKey(complement)) {
                int temp1 = hm.get(complement);
                count += temp1;
            }
            if (hm.containsKey(runningSum)) {
                int temp2 = hm.get(runningSum);
                hm.put(runningSum, temp2+1);
            } else {
                hm.put(runningSum, 1);
            }
        }
        
        return count;
    }
}
