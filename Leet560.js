// Time Complexity : O(1)
// Space Complexity : O(n) 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach : linear search and set using O(1) approach
/**
 * @param {number[]} nums
 * @param {number} k
 * @return {number}
 */
var subarraySum = function(nums, k) {
   let count=0;
   let map = new Map();
   let sum = 0;
   map.set(0,1);
   for(let i=0;i<nums.length;i++)
   {
       sum +=nums[i];
       if(map.has(sum-k)) count+=map.get(sum-k);
       if(map.has(sum)) map.set(sum,map.get(sum)+1);
       else map.set(sum,1);
   }
    return count;
};