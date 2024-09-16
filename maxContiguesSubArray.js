// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this: No

// make a hashmap to store the count and index. 
// whenever the count encountered, we check for equal no. of zeros and ones ecountred before to findn the longest subarray.


/**
 * @param {number[]} nums
 * @return {number}
 */
var findMaxLength = function(nums) {
    if(nums === null || nums.length === 0) return 0;
    let hashMap = new Map();
    hashMap.set(0,-1);
    let maxLen = 0, count = 0;
    
    for(let i = 0; i < nums.length; i++){
        count = count + (nums[i] == 1 ? 1 : -1)
        if(hashMap.has(count)){
            
            maxLen = Math.max(maxLen, i - hashMap.get(count));
            
        } else {
            hashMap.set(count, i);
        }
    }
    return maxLen;
}