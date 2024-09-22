// Time Complexity : O(n)
// Space Complexity : o(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


/**
 * @param {number[]} nums
 * @return {number}
 */
var findMaxLength = function(nums) {
    var map = {0:-1};
    var rSum = 0;
    var max = 0;
     for(let i =0 ; i <nums.length; i++){
         if(nums[i] == 0) rSum -= 1;
         else rSum += 1;
         if(rSum in map){
             max = Math.max(max, i - map[rSum]);
         }else{
             map[rSum] = i;
         }
     } 
     return max;
 };