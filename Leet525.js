// Time Complexity : O(1)
// Space Complexity : O(n) 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach : linear search and map using O(1) approach

/**
 * @param {number[]} nums
 * @return {number}
 */
var findMaxLength = function(nums) {
    var map={0:-1};
    let count =0;
    let max = 0;
    for(let i=0;i<nums.length;i++)
    {
        if(nums[i]===0)
        {
            count--;
        }
        else
            count++;
        if(map[count]!=null)
        {
            max = Math.max(max, i-map[count]);
        }
        else
            map[count]=i;
    }
    return max;
};