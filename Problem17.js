// time complexity: O(n);
// space complexity: O(n)
// Did this code successfully run on Leetcode : Yes
/**
 * @param {number[]} nums
 * @param {number} k
 * @return {number}
 */
var subarraySum = function(nums, k) {
    let m = new Map();
    let rSum = 0;
    let res = 0;
    m.set(0,1);
    
    for(let i=0; i< nums.length; i++){
        rSum += nums[i];
        if(m.has(rSum-k)){
            res = res + m.get(rSum-k)
         } 
        if(m.has(rSum)){
            m.set(rSum, m.get(rSum)+1)
        } else {
            m.set(rSum, 1)
        }
    }
    return res
};