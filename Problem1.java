//Problem: 560. Subarray Sum Equals K
/** 3 Pointer Approcach: 
 * Used 2 loops to iterate over all possible subarrays.
 */ 
//
//time Complexity :
// O(N^2)

// Space Complexity :
// O(1)

// Did this code successfully run on Leetcode : YES.
// Any problem you faced while coding this : NO.


class Problem1_BruteForce {
    public int subarraySum(int[] nums, int k) {
       
        int count = 0;
        
        for(int i =0; i < nums.length; i++){

             int sum = 0;

             for(int j =i; j < nums.length; j++){
            
                  sum += nums[j];
                  
                  if(sum == k)
                  {
                      count++;
                  }
             }
        }
        
        return count;
    }
}