// Subarray Sum Equals K
/**
 * @param {number[]} nums
 * @param {number} k
 * @return {number}
 */
var subarraySum = function(nums, k) {
    // edge cases
    if (nums == null || nums.length == 0) return -1;

    // Initial sums hash to keep track of sums we've seen before
    const sums = {
        0: 1
    };
    // Running sum
    let currSum = 0,
    // Count of number of solutions
        count = 0;

    for (const i of nums) {
        // Add the current number to our running sum
        currSum += i;

        // Check to see if we have seen this sum before
        if (sums[currSum - k]) {
            // If so, add the number stored in our sums hash to count
            count += sums[currSum - k];
        }

        // If it exists in the sums hash already, increment
        // Otherwise, add it to the hash with a value of 1
        sums[currSum] = sums[currSum] ? sums[currSum] + 1 : 1;
    }
    return count;
};
