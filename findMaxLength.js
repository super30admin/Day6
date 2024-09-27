// Time Complexity : O(n) where n is nums length
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No

/**
 * @param {number[]} nums
 * @return {number}
 */
var findMaxLength = function(nums) {
    let max = 0;
    let rsum = 0;
    const map = new Map();
    map.set(0,-1);
    for(let i=0; i<nums.length; i++) {
        if(nums[i] === 0) rsum--;
        else rsum++;
    
        if(map.has(rsum)) {
            max = Math.max(max, i - map.get(rsum));
        } else {
            map.set(rsum, i);   
        }
    }
    return max;
};