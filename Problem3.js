// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes

var longestPalindrome = function (s) {
    if (!s || s.length === 0) return 0;
    let map = new Map();
    let count = 0;
    for (let i = 0; i < s.length; i++) {
        const char = s[i];
        if (map.has(char)) {
            count += 2;
            map.delete(char);
        } else {
            map.set(char, 1);
        }
    }
    if (map.size !== 0) {
        count++;
    }

    return count;
};