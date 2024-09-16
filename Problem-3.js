// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None


// Your code here along with comments explaining your approach

/**
 * @param {string} s
 * @return {number}
 */
 var longestPalindrome = function(s) {
    let frequency = {};
    
    s.split('').forEach((item) => {
        frequency[item] = frequency[item] ? frequency[item] + 1 : 1;
    });
    
    let oddCount = 0;
    let evenCount = 0;
    
    for (let item in frequency) {
        if (frequency[item] % 2 === 0) {
            evenCount += frequency[item];
        } else {
            evenCount += frequency[item] - 1;
            oddCount = 1;
        }
    }
    return evenCount + oddCount;
};