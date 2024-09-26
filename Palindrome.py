"""
// Time Complexity : O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no
"""
class Solution(object):
    def longestPalindrome(self, s):
        hash = set()
        for c in s:
            if c not in hash:
                hash.add(c)
            else:
                hash.remove(c)
        # len(hash) is the number of the odd letters
        if len(s) > 0:
            return len(s) - len(hash) + 1
        else:
            return 0