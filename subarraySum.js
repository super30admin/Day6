// Time Complexity : O(n^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No, but could be optimised more with hashmap.

//continously keep check of the sum == k in the double for loop
//increse count variable as the condition is satisfied.
// return count

/**
 * @param {number[]} nums
 * @param {number} k
 * @return {number}
 */
var subarraySum = function(nums, k) {
    let count = 0
    for(let i = 0; i < nums.length; i++){
     
        for(let j = i; j < nums.length; j++){
            let sum = 0
            sum += nums[j]
            
            if(sum == k){
                count++
            }
        }
    }
    return count
}