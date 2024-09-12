// Time Complexity : O(N), where N is the length of nums
// Space Complexity : O(N), where N is the length of nums

// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// https://leetcode.com/problems/subarray-sum-equals-k/
// 560. Subarray Sum Equals K
/**
 * @param {number[]} nums
 * @param {number} k
 * @return {number}
 */
var subarraySum = function (nums, k) {

    if (nums === null)
        return 0;
    let ans = 0;
    let rsum = 0;
    // Map to trach, rsum and its frequency
    let sumMap = new Map();
    // Base case, set rsum = 0
    sumMap.set(rsum, 1);
    nums.forEach((num) => {
        // Add num value to rsum
        rsum += num;
        // Check if the difference of rsum and the target has occured
        // If it has, add the frequency to result
        let diff = rsum - k;
        if (sumMap.has(diff)) {
            ans += sumMap.get(diff);
        }
        if (sumMap.has(rsum)) {
            sumMap.set(rsum, sumMap.get(rsum) + 1);
        } else {
            sumMap.set(rsum, 1);
        }
    })

    return ans;
};