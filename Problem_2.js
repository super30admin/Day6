// Time Complexity : O(N), where N is the length of array
// Space Complexity : O(N), where N is the length of array

// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Problem2 (https://leetcode.com/problems/contiguous-array/)
/**
 * @param {number[]} nums
 * @return {number}
 */
 var findMaxLength = function(nums) {
    // If array does not exist or its length is less than 2, return 0
    if(nums===null || nums.length<2){
        return 0;
    }
    let len = 0;
    // Set running sum to 0
    let rsum = 0;
    // Map to maintain 1st rsum occurence and its index
    let map = new Map();
    // Base case for edge cases like [0,1]
    map.set(0,-1);
    for(let i=0; i<nums.length; i++){
        // If array has 1, add 1 to rsum
        if(nums[i]===1){
            rsum++;
        } else {
            // else subtract 1 to rsum
            rsum--;
        }
        // If map has 1st occurence of rsum, set length to max of existing and new length
        if(map.has(rsum)){
            len = Math.max(len, i-map.get(rsum));
        }else{
            // Else add the 1st rsum occurence
            map.set(rsum, i);
        }
    }
    return len;
};