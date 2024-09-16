// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes

var findMaxLength = function (nums) {
    if (!nums || nums.length === 0) return 0
    let map = new Map();
    map.set(0, -1);
    let max = 0, count = 0;
    for (let i = 0; i < nums.length; i++) {
        if (nums[i] === 0) {
            count--;
        } else {
            count++;
        }

        if (map.has(count)) {
            max = Math.max(max, i - map.get(count));
        } else {
            map.set(count, i);
        }
    }

    return max;

};