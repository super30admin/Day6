# // Time Complexity : O(n)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this : No

class Solution(object):
    def longestPalindrome(self, s):
        """
        :type s: str
        :rtype: int
        """

        s_set = set()
        longestPalin = 0

        for char in s:
            if char in s_set:
                longestPalin = longestPalin + 2
                s_set.remove(char)
            else:
                s_set.add(char)

        if len(s_set) != 0:
            return longestPalin + 1

        return longestPalin
