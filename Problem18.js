// time complexity: O(n);
// space complexity: O(n)
// Did this code successfully run on Leetcode : Yes
/**
 * @param {number[]} nums
 * @return {number}
 */
var findMaxLength = function(nums) {
    const m = new Map();
    let rSum = 0;
    m.set(0, -1);
    let max = 0;
    for(let i=0; i<nums.length; i++){
        if(nums[i] === 0){
            rSum--;
        } else{
            rSum++;
        } 
        if(m.has(rSum)){
            let idx = m.get(rSum)+1;
            if(max < (i - idx + 1)){
                max = i - idx + 1;
            }
        } else {
            m.set(rSum, i)
        }
    }
    return max
};