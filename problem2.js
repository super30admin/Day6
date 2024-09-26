// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes

// ## Problem2 (https://leetcode.com/problems/contiguous-array/)
// Given a binary array, find the maximum length of a contiguous subarray with equal number of 0 and 1.

// Example 1:

// Input: [0,1]
// Output: 2
// Explanation: [0, 1] is the longest contiguous subarray with equal number of 0 and 1.
// Example 2:

// Input: [0,1,0]
// Output: 2
// Explanation: [0, 1] (or [1, 0]) is a longest contiguous subarray with equal number of 0 and 1.
// Note: The length of the given binary array will not exceed 50,000.


var findMaxLength = function(nums) {
    let map = new Map();
    map.set(0, -1);
    let maxlen = 0, count = 0;
    for (let i = 0; i < nums.length; i++) {
        count = count + (nums[i] == 1 ? 1 : -1);
        if (map.has(count)) {
            maxlen = Math.max(maxlen, i - map.get(count));
        } else {
            map.set(count, i);
        }
    }
    return maxlen;
};



// Brute force solution
//time O(n^2)
//space O(1)
var findMaxLength = function(nums) {
    let max = 0;
    for(let i = 0; i < nums.length; i++) {
        let sum = 0;
        for(let j = i; j < nums.length; j++) {
            if(nums[j] === 0) sum += -1;
            else sum += 1;
            if(sum === 0) max = Math.max((j-i+1),max);
        }
    }
    return max;
}


