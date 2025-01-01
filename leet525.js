/**
 * TC : O(N)
 * SC : O(N)
 * @param {number[]} nums
 * @return {number}
 */
var findMaxLength = function(nums) {
   var hash = new Map();
    var zero=0,one=0,max=0,diff=0;
    hash.set(0,-1);
    for(let i=0;i<nums.length;i++){
        nums[i]==0?zero++:one++;
        diff = (zero-one);
        if(hash.has(diff)){
            max = Math.max(max,i-hash.get(diff));
        }else{
            hash.set(diff,i);
        }
    }
    return max;
 
};