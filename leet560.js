/**
 * TC : O(N)
 * SC : O(N)
 * @param {number[]} nums
 * @param {number} k
 * @return {number}
 */
var subarraySum = function(nums, k) {
    var count=0,sum=0;
    var mp = new Map();
    mp.set(0,1);
    for(let i=0;i<nums.length;i++){
        sum+=nums[i];
        if(mp.has(sum-k)){
            count+=mp.get(sum-k);
        }
        mp.set(sum,mp.get(sum)+1||1);
    }
    return count;
};