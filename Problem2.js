//Contiguous Array (LC 525)

// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Yes initially I had problems with using a object instead of a map

//Use running sum and add when 1 and subtract when 0. The max would be the current index minus the index at the runSum value
/**
 * @param {number[]} nums
 * @return {number}
 */
var findMaxLength = function(nums) {
    if(nums.length === 0 || nums === null){
        return 0;
    }
    let max = 0;
    let hashMap = new Map();
    hashMap.set(0,-1);
    let runSum = 0;
    for(let i=0;i<nums.length;i++){
        runSum += (nums[i] === 0) ? -1: 1;
        if(hashMap.has(runSum)){ 
            max = Math.max(max,i-hashMap.get(runSum));
        } else {
            hashMap.set(runSum,i);
        }
    }
    return max;
};