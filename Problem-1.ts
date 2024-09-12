// Time Complexity : O(n^2)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :
function subarraySum(nums: number[], k: number): number {
    let count = 0;
    let sum = 0;

    // create a new map to store sub array
    const map = new Map();

    // Add 0 as sum, 1 as value to map
    map.set(0, 1);
    for (let i = 0; i < nums.length; i++) {
        // current sum
        sum += nums[i];
        if (map.has(sum - k)) {
             // increate the count if we have seen a sum that equals sum - k
            count += map.get(sum - k);

        }
        // set new value in map
        map.set(sum, (map.get(sum) || 0) + 1);
    }
    return count;
};