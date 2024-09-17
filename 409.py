// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach


class Solution:
    def longestPalindrome(self, s: str) -> int:
        final_set = set()
        count = 0
        for i in s:
            if i in final_set:
                count += 2
                final_set.remove(i)
            else:
                final_set.add(i)
            
        if len(final_set) != 0:
            count += 1
        return count
            