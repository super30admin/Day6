// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None


// Your code here along with comments explaining your approach

// logic explanation,
// currentsum - k = value_in_map
// currentsum = k + value_in_map
// so if value_in_map is present, then k must hv occurred

/**
 * @param {number[]} nums
 * @param {number} k
 * @return {number}
 */
 var subarraySum = function(nums, k) {
    var map = new Map();
    map.set(0,1);
    var sum = 0;
    var cnt = 0;
    for(var num of nums)
    {
        sum += num;
        if(map.has(sum-k)){
           cnt += map.get(sum-k);
        }
        map.set(sum, map.has(sum) ? map.get(sum)+1 : 1);
    }
    return cnt;
};