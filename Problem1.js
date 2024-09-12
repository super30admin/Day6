//Subarray Sum Equals (LC 560)

// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Yes initially I had problems with using a object instead of a map

//Use running sum to get compliment and if it exists add to count
/**
 * @param {number[]} nums
 * @param {number} k
 * @return {number}
 */
var subarraySum = function(nums, k) {
    if(nums.length === 0 || nums === null) {
        return 0;
    }
    let count = 0;
    let rSum = 0;
    let hashMap = new Map();
    hashMap.set(0,1);
    for(let i=0;i<nums.length;i++){
        rSum += nums[i];
        let compliment = rSum - k;
        if(hashMap.has(compliment)){
            count += hashMap.get(compliment);
        }
        if(!hashMap.has(rSum)){
            hashMap.set(rSum,0);
        } 
        hashMap.set(rSum, hashMap.get(rSum)+1);
    }
    return count;
};