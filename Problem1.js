// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes

var subarraySum = function (nums, k) {
    if (!nums || nums.length === 0) return 0;
    let map = new Map();
    map.set(0, 1);
    let rSum = 0, count = 0;
    for (let i = 0; i < nums.length; i++) {
        rSum += nums[i];
        if (map.has(rSum - k)) {
            count += map.get(rSum - k);
        }
        if (map.has(rSum)) {
            map.set(rSum, map.get(rSum) + 1);
        } else {
            map.set(rSum, 1);
        }
    }
    return count;

};