# https://leetcode.com/problems/longest-palindrome
# // Time Complexity : o(n) => n is length of string
# // Space Complexity : o(1)
# // Did this code successfully run on Leetcode : yes
# // Any problem you faced while coding this : None
#

class Solution:
    def longestPalindrome(self, s: str) -> int:
        hm = dict()
        length = 0
        for i in range(len(s)):
            if s[i] not in hm:
                hm[s[i]] = 1
            else:
                length += 2
                del hm[s[i]]

        if len(hm) > 0:
            length += 1
        return length