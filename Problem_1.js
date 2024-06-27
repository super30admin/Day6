// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
// Your code here along with comments explaining your approach: Using running sum method as taught in class
/**
/**
 * @param {number[]} nums
 * @param {number} k
 * @return {number}
 */
var subarraySum = function(nums, k) {
    let rSum = 0;
    let rSumMap = new Map();
    rSumMap.set(0, 1);
    let subArrCount = 0;

    for(let i=0; i<nums.length; i++){
        rSum += nums[i];
        if(rSumMap.has(rSum - k)){
            subArrCount+= rSumMap.get(rSum - k);
        }
        if(rSumMap.has(rSum)){
            let tmp = rSumMap.get(rSum);
            rSumMap.set(rSum, tmp+1);
        }
        else
            rSumMap.set(rSum, 1);   
        
    }
    return subArrCount;
};