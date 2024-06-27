// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
// Your code here along with comments explaining your approach: Using running sum method as taught in class
/**
 * @param {number[]} nums
 * @return {number}
 */
var findMaxLength = function(nums) {
    let rSum = 0;
    let numFirstMap = new Map();
    numFirstMap.set(0, -1);
    let maxLength = 0;

    for(let i =0; i<nums.length; i++){
        let currlength = 0;
        if(nums[i]=== 0)
            rSum--;
        else if(nums[i] === 1)
            rSum++;
        if(numFirstMap.has(rSum))
            currlength = i - numFirstMap.get(rSum);
        else
            numFirstMap.set(rSum, i);

        maxLength = Math.max(currlength, maxLength);

    }
    return maxLength;
};