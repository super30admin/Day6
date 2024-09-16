// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

/**
Algorithm : Using Hash Map

Iterate the numbers and count the number of 0s and 1s
Save the first appearance of count in a hash map as hash = {count:index}
When the same count appears again at i, it means between hash[count] to i, the number of 0s and 1s evened out and it's back to its previous level.
**/

/**
 * @param {number[]} nums
 * @return {number}
 */
var findMaxLength = function(nums) {
    let hash = {0:-1};
    let count = 0;
    let max = 0;
    for (let i=0;i<nums.length;i++) {
        if (nums[i] == 0) count--;
        else count++;

        if (hash[count]!=null) max = Math.max(max, i - hash[count]);
        else hash[count] = i 
    }
    return max;
};