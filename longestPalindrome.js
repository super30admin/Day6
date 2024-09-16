//   Time Complexity : O(N)
//   Space Complexity : O(N) 
//   Did this code successfully run on Leetcode :Yes
//   Any problem you faced while coding this : No

var longestPalindrome = function(s) {
    const set = new Set();
    let count = 0;
    
    for (const char of s) {
        if (set.has(char)) {
			count += 2;
            set.delete(char);
        } 
		else {
            set.add(char);
        }
    }

    return count + (set.size > 0 ? 1 : 0);
};