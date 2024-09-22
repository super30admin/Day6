// Time Complexity : O(n)
// Space Complexity : o(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No



/**
 * @param {number[]} nums
 * @param {number} k
 * @return {number}
 */
var subarraySum = function(nums, k) {
    var rSum = 0;
    var count = 0;
    var map = {0:1};
    for(let i=0;i< nums.length; i++){
        rSum += nums[i];
        var y = rSum - k;
        if(y in map){
            count += map[y];
        }

        if(rSum in map){
            map[rSum] += 1;
        }else{
            map[rSum] = 1;
        }

    }
    return count;
};