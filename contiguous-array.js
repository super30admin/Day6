// Contiguous Array

/**
 * @param {number[]} nums
 * @return {number}
 */
var findMaxLength = function(nums) {
    // Edge case
    if (nums == null || nums.length == 0) return 0;

    // Initialize a running sum
    // Add 1 for every 1 we encounter
    // Add -1 for every 0 we encounter
    //
    // Instantiate a maxLength variable to return later
    let runningSum = 0,
        maxLen = 0;

    // In the beginning, the number of 0's = the number of 1's
    // And the index that happens is **quote** -1 **unquote**
    const countHash = {0: -1};
    for (const [index, num] of nums.entries()) {
        // Calculate the current running sum
        runningSum += (num == 0 ? -1 : 1);

        // Check to see if we have encountered this sum
        if (typeof countHash[runningSum] == "number") {
            // Choose the max number
            // 1) the current max length
            // 2) the difference between the first index we saw this sum
            //    and the current index
            maxLen = Math.max(maxLen, index - countHash[runningSum]);
        } else {
            // Since we haven't encountered this current running sum
            // store the index of this sum in our countHash variable
            countHash[runningSum] = index;
        }
    }

    return maxLen;
};
