
// Time Complexity : O(n^3)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Time Limit Exceeded

/**
Algorithm : Iterative/Brute force

Take two for loops and interate through array. Find all subarrays whose sum = k 
and increment count variable.
Return count.
**/

/**
 * @param {number[]} nums
 * @param {number} k
 * @return {number}
 */
var subarraySum = function(nums, k) {
    var count = 0;
    
    for(var start=0; start < nums.length; start++){
        for(var end=start+1; end <= nums.length; end ++){
            var sum = 0;
            for(var i = start; i < end; i++){
                sum = sum + nums[i]
            }
            if(sum === k)
                count++;
            
        }
    }
  return count;  
};