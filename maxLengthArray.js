/**
 * @param {number[]} nums
 * @return {number}
 */
var findMaxLength = function(nums) {
    if(nums == null || nums.length == 0) return 0;
    let map = new Map();
    //Running Sum
    let rSum = 0;
    let max =0;
    //Initially setting the -1th index value to 0 in the map.
    map.set(0,-1);
    for(i=0;i<nums.length;i++){
         rSum = nums[i]==0? rSum - 1: rSum+1;
        if(map.has(rSum)){
            let currentSum = i - map.get(rSum);
            max = Math.max(currentSum,max);
        } else {
            map.set(rSum,i);
        }  
        
    }
    
    return max;
     
};

// Time Complexity : O(n) - As we have to iterate through the entire array of n elements size.
// Space Complexity : Constant. Irrespective of the length of the string.
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

